package practical17package;

public class Demo2 extends Demo1{
    public static void test(){
        System.out.println("Inside practical17package.Demo2 test()");
        //System.out.println(Demo1.a); not visible here
        System.out.println(Demo1.b);
        System.out.println(Demo1.c);
    }
}