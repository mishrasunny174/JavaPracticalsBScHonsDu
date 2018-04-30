package practical16package.fibonacci;

public class Fibonacci{
    public static int getMember(int n){
        if(n<=1)
            return 1;
        return getMember(n-1)+getMember(n-2);
    }
}