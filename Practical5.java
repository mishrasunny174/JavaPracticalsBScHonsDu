public class Practical5{
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("Usage: java Practical5 <number>");
            return;
        }
        try{
            int number = Integer.parseInt(args[0]);
            String binary="";
            while(number!=0){
                binary=number%2+binary;
                number/=2;
            }
            System.out.println(binary);
        } catch (NumberFormatException e) {
            System.out.println("Not a Number");
        }
    }
}