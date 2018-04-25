public class Practical13
{
    public static void main(String[] args) {
        System.out.println("Sum of 1,2,3,6,4,8,9,54,10 is "+Demo.sum(1,2,3,6,4,8,9,54,10));
    }
}

class Demo{
    public static int sum(int... values){
        int sum = 0;
        for(int value:values){
            sum+=value;
        }
        return sum;
    }
}