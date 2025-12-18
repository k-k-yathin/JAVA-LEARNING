import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        // basically a class having all the data types like numbers,characters etc
        // used for boxing and unboxing i.e converting primitive to reference and vice versa
        ArrayList<Integer> list = new ArrayList<Integer>();
     //   int a = list.get(0);

        // primitive to reference
        int intValue = 50;
        Integer intObj = Integer.valueOf(intValue);
        Double doubleValue = Double.valueOf(intValue);
        System.out.println(intValue);
        System.out.println(intObj);
        System.out.println(doubleValue);

        if(intObj instanceof Integer){
            System.out.println("yes it is an object of Integer");
        }

        // reference to primitive
        int k = intObj.intValue();
        double d = intObj.doubleValue();
        System.out.println(k+d); //sum of them
    }
}
