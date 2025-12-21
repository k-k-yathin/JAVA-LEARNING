public class StringMethods {
    public static void main(String[] args) {
        String message = "    Hello     World!!";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("!","*"));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());// removes whitespaces
        System.out.println(message.endsWith("!"));
        System.out.println(message.concat(" ALL THE VERY BEST"));
    }
}
