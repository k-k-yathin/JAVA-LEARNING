public class Operators {
    public static void main(String[] args) {
        // arithmetic operators
        // + - / * %
        float sellingPrice = 580.36F;
        float listingPrice = 580.45F;
        float discount = (listingPrice-sellingPrice)*100;
        System.out.println(discount);

        // Relational or comparison operators
        // >,<,>=,<=,==,!= or <>
        var result = listingPrice > sellingPrice;
        System.out.println(result);

        int selling_Price = 12000;
        int cost_Price = 11000;
        if(selling_Price > cost_Price) {
            System.out.println("Profit");
        }
        else if(selling_Price < cost_Price) {
            System.out.println("Loss");
        }
        else {
            System.out.println("Error");
        }

        //logical operators
        boolean isLoggedIn = false,isEmailVerified=true,cardInfo=true;
        if(isLoggedIn&&isEmailVerified&&cardInfo) {
            System.out.println("Allow to make a purchase");
        }
        else {
            System.out.println("Stop the purchase");
        }

        boolean email=true,google=true,facebook=false;
        if(email||google||facebook) {
            System.out.println("Login Success.");
        }
        else{
            System.out.println("Login Failed.");
        }

        //conditional operators
        //(condition) ? (true-expression) : (false-expression)

        boolean authenticated = true;
        String result1 = (authenticated) ? "SignOut Button" : "SignIn Button";
        System.out.println(result1);
    }
}
