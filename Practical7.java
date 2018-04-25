import java.util.Scanner;

public class Practical7{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        if(args.length==0){
            System.out.println("Usage: java Practical7 <number of inputs>");
            return;
        }
        try{
            int noOfInputs=Integer.parseInt(args[0]);
            int sum=0;
            for(int i=0; i<noOfInputs; i++)
            {
                System.out.print("Enter input number "+(i+1)+" : ");
                sum+=scanner.nextInt();
            }
            System.out.println("Sum = "+sum);
        } catch (NumberFormatException e) {
            System.out.println("Not a number.");
        }
    }
}