public class Practical20{
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++) {
                if(i==5)
                    throw new TestException("Exception in loop at iteration "+i);
                System.out.println("Loop ran successfully at iteration "+i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class TestException extends Exception{
    public TestException(String msg) {
        super(msg);
    }
}