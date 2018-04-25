import practical17package.*;

public class Practical17 extends Demo1{
    public static void main(String[] args) {
        System.out.println("Inside Practical17 main()");
        //System.out.println(Demo1.a); not visible here
        System.out.println(Demo1.b);
        System.out.println(Demo1.c);
        Demo2.test();
    }
}