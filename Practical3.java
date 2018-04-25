import java.util.Random;

public class Practical3{
    public static void main(String args[]){
        int array[] = new int[10];
        Random random = new Random();
        for(int i=0; i<10; i++)
            array[i]=Math.abs(random.nextInt()%100);
        for(int x : array)
            System.out.print(x+" ");
    }
}