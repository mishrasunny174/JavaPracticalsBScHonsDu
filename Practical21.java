public class Practical21{
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            for(int i=0;i<10;i++) {
                System.out.println("Thread t1 iteration "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread t2 = new Thread(()-> {
            for(int i=0;i<10;i++) {
                System.out.println("Thread t2 iteration "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
        try {
            t1.join();
            System.out.println("Thread t1 completed with priority "+t1.getPriority());
            t2.join();  
            System.out.println("Thread t2 completed with priority "+t2.getPriority());                      
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}