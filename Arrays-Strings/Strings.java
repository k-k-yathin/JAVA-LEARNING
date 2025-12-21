public class Strings {
    public static void main(String[] args) {
        //Sequence of characters
        //to represent text-based info
        // represented using the String class , part of the java.lang package
        // are immutable
        // if any changes are made then a new String object is created , this makes Strings in java more secure and thread-safe

        // Creating a String using String lateral:
        String name = "K K YATHIN";
        System.out.println(name);

        String anotherName = "K K YATHIN";
        System.out.println(anotherName);

        //Creating a String using new Keyword
        String desc = new String("Hello Everyone");
        System.out.println(desc);

        //String Concatenation
        String val1 = "Something";
        String val2 = new String("Something new");
        String val3 = val1 + val2;
        System.out.println(val3);
    }
}
