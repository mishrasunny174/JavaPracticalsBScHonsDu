import java.util.Random;

public class Practical4{
    public static void main(String args[]){
        int array[][] = new int[10][10];
        Random random = new Random();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                array[i][j]=Math.abs(random.nextInt()%100);
            }
        }

        for(int[] outer : array){
            for(int x: outer){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}