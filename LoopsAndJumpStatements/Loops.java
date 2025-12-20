import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //loops are used to repeat some block of statements
        //for loops : index declaration,condition and update statement
        int maxNum = 5;
        for (int i = 1; i < maxNum; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= maxNum; i++) {
            sum += i;
        }
        System.out.println(sum);

        //while loops : used when we don't know how many times the block needs to get executed , but we know the conditions when it should run.
        int k = 1;
        int sum1 = 0;
        while (k <= maxNum) {
            sum1 += k;
            k += 1;
        }
        System.out.println(sum1);

        //for input type limitations we use while loops
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Enter Input : ");
            Scanner sc = new Scanner(System.in);
            input = sc.next();
            System.out.println("your input is : " + input);
        }

        // do-while loops : runs 1 time , then runs based on the condition
        int g = 100;
        do {
            System.out.println("Hello World : " + g);
            g--;
        } while (g <= 5);

        //for-each loops : used to traverse an array or collection , cannot traverse by reverse order
        String[] names = {"King","Kocchar","Sherya","Roger"};
        for(var name : names) {
            System.out.println(name);
        }

        // jump statements : break , continue
        // break for going completely out of the loop
        // continue for jus skipping the current iteration
        int h = 20;
        int b=0;
        while(b<100){
            System.out.println(b);
            b+=1;
            if(b==h){
                continue;
        }
            else if(b>0){
                break;
            }
        }
    }
}
