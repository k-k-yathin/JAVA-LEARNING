public class SwitchCases {
    public static void main(String[] args) {
        //runs the statement if it matches the case
        //else the default case will be ran
        String role="admin";
        switch (role){
            case "admin":
                System.out.println("You will get full access to the course");
                break;
            case "subadmin":
                System.out.println("You can create or delete the course");
                break;
            default:
                System.out.println("You are not admin");
        }

    }
}
