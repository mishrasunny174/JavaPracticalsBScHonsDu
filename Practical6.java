import java.util.Scanner;

public class Practical6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(number); i++){
            if(number%i==0)
                isPrime=false;
        }

        if(isPrime){
            System.out.println(number+ " is prime.");
        } else {
            System.out.println(number+" is not prime.");
        }
    }
}