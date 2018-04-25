public class Practical22{
    public static void main(String[] args) {
        List list = new List();
        Thread producer = new Thread(new Producer(list));
        Thread consumer = new Thread(new Consumer(list));
        producer.start();
        consumer.start();
        try {
            producer.join();
            producer.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class List{
    private int item;
    private boolean hasValue;
    public synchronized int getItem(){
        while(!hasValue){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        hasValue = false;
        notify();
        return item;
    }
    public synchronized void setItem(int item) {
        while(hasValue){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        hasValue = true;
        notify();
        this.item = item;
    }
}

class Producer implements Runnable {

    private List list;

    public Producer(List list){
        this.list = list;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Producing "+i);
            list.setItem(i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Consumer implements Runnable {

    private List list;

    public Consumer(List list){
        this.list = list;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Consuming: "+list.getItem());
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}