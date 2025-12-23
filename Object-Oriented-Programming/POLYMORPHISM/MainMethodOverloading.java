public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Main method with String Array");
        main(100,200);
    }
    public static void main(String args){
        System.out.println("Main method with String");
    }
    public static void main(int args1,int args2){
        System.out.println("Main method with integer arguments");
        main("HELLO WORLD");
    }
}
