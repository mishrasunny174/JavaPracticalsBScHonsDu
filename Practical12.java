public class Practical12{
    public static void main(String[] args) {
        Distance dist = new Distance(10,9);
        System.out.println(dist.feets); //accesible as specified public
        //System.out.println(dist.inches); inaccesible as specified private
        int var = 10;
        System.out.println("before calling change fucntion value of var: "+var);
        Demo.change(var);
        System.out.println("after calling change fucntion value of var: "+var); 
        //value inside variable var is not changed as it is passed by value
        System.out.println("before calling change fucntion value of dist(feets): "+dist.feets);
        Demo.change(dist);
        System.out.println("after calling change fucntion value of dist(feets): "+dist.feets); 
        //value inside variable var is changed as it is passed by referance
    }
}

class Distance{
    public int feets;
    private int inches;

    public Distance(int feets,int inches){
        this.feets = feets;
        this.inches = inches;
    }
}

class Demo{
    public static void change(int value){
        value++;
        System.out.println("Inside change() value of var: "+value);
    }

    public static void change(Distance dist){
        dist.feets++;
        System.out.println("Inside change() value of dist(feets): "+dist);
    }
}
