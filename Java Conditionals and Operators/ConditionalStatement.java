public class ConditionalStatement {
    public static void main(String[] args) {
        int income = 2_00_000;
        if(income > 2_00_000){
            System.out.println("you can travel in business class");
        }
        if(income == 2_00_000){
            System.out.println("you can travel in Premium economy class");
        }
        else if(income < 2_00_000){
            System.out.println("you can travel in Economy class");
        }
        else {
            System.out.println("Not valid income");
        }
    }
}
