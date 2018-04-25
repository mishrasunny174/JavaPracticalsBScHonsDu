public class Practical1{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("Usage: java Practical <num1>, <num2> ...");
            return;
        }
        int sum=0;
        for(int i=0; i<args.length; i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Sum = "+sum);
    }
}