public class Practical8{
    public static void main(String args[]){
        String str = "Hello";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.setCharAt(0,'P');
        System.out.println(strBuilder);
        strBuilder.setCharAt(0,'H');
        System.out.println(strBuilder);
        strBuilder.append(" World!");
        System.out.println(strBuilder);
        strBuilder.insert(5,",");
        System.out.println(strBuilder);
        str=str.concat(", World!");
        System.out.println(str);
        String strTemp = strBuilder.toString();
        if(str.equals(strTemp)){
            System.out.println("Both String are equal!");
        } else {
            System.out.println("Both String are not equal!");
        }
        System.out.println("Length of strBuilder: "+strBuilder.length());
        strBuilder.setLength(100);
        System.out.println("Length of strBuilder after setLength: "+strBuilder.length());
    }
}