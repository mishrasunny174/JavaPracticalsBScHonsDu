public class Practical10{
    public static void main(String args[]){
        Distance height = new Distance(5,11);
        System.out.println(height);
        Distance heightCopy = new Distance(height);
        System.out.println(height);      
        try{
            Distance heightClone =(Distance)height.clone();
            System.out.println(heightClone);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

class Distance implements Cloneable{

    private int feet,inches;
    private final double noOfInchesInCm = 0.393701;
    public Distance(float centiMeters){
        inches = (int)(centiMeters*noOfInchesInCm);
        feet = inches/12;
        inches = inches%12;
    }

    public Distance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }

    public Distance(Distance temp){
        this.feet=temp.feet;
        this.inches=temp.inches;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return feet+" Feets and "+inches+" inches";
    }
}