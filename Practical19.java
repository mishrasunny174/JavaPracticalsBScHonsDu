import java.io.IOException;

public class Practical19{

    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            try{
                switch(i){
                    case 0:
                        throw new ArithmeticException();
                    case 1:
                        throw new ArrayIndexOutOfBoundsException();
                    case 2:
                        throw new IOException();
                    case 3:
                        throw new NullPointerException();

                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}