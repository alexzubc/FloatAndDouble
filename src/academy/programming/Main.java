package academy.programming;

public class Main {

    public static void main(String[] args) {
       float myMinFloatValue = Float.MIN_VALUE;
       float myMaxFloatValue = Float.MAX_VALUE;
       System.out.println("Float Minimum Valiue = " + myMinFloatValue);
       System.out.println("Float Maximum Valiue = " + myMaxFloatValue);       
       
       double myMinDoubleValue = Double.MIN_VALUE;
       double myMaxDoubleValue = Double.MAX_VALUE;
       System.out.println("Double Minimum Valiue = " + myMinDoubleValue);
       System.out.println("Double Maximum Valiue = " + myMaxDoubleValue);

       int myIntValue = 5 / 3;
       float myFloatValue = 5f / 3f;
       double myDoubleValue = 5.00 / 3.00;
       System.out.println("MyIntValue = " + myIntValue);
       System.out.println("MyFloatValue = " + myFloatValue);
       System.out.println("MyDoubleValue = " + myDoubleValue);
    }
}