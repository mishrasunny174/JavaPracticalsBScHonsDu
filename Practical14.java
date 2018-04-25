public class Practical14{
    public static void main(String[] args) {
        Integer a = 10;
        int b = 10;
        int c = sum(a,b);
        System.out.println("a + b = " + c);
    }

    public static Integer sum(int a,Integer b) {
        return a+b;
    }
}