import practical16package.fibonacci.Fibonacci;
import java.util.Scanner;

public class Practical16{
    public static void main(String[] args) {
        System.out.print("Enter which member of fibonacci series you want: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%d member of fibonacci series is %d\n",n,Fibonacci.getMember(n));
    }
}