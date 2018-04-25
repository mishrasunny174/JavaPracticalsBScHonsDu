import java.util.Scanner;

public class Practical2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = scanner.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.printf("%d! = %d\n",num,fact);
    }
}