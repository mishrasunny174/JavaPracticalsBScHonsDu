import java.util.Scanner;

public class Practical18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        try{
            System.out.println("a / b = "+a/b);
        } catch (ArithmeticException e) {
            System.out.println("Cant Device by zero");
        }
    }
}