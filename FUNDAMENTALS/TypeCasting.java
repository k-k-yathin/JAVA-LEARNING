public class TypeCasting {
    public static void main(String[] args) {
        //method to change the date type
        //implicit is to widen the data type (making it larger)
        //explicit is to narrow the data type( making it smaller)

        //conversion of a string to an int
        String s = "40";
        int i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(s.getClass().getName());
        //implicit typecasting
        int intValue = 10;
        long longValue = intValue;
        double doubleValue = longValue;

        //explicit typecasting
        double x = 10000000.2834;
        long longValue2 = (long)x;
        System.out.println(longValue2);
    }
}
