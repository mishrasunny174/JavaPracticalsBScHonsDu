public class Practical9{
    public static void main(String args[]){
        Distance height = new Distance(182);
        System.out.println(height);
    }
}

class Distance{

    private int feet,inches;
    private final double noOfInchesInCm = 0.393701;
    public Distance(float centiMeters){
        inches = (int)(centiMeters*noOfInchesInCm);
        feet = inches/12;
        inches = inches%12;
    }

    public String toString(){
        return feet+" Feets and "+inches+" inches";
    }
}