interface IManageAccount{
    static void welcome(){
        System.out.println("Welcome to Course Management System");
    }
    void openAccount();
    void closeAccount();
}
interface IBankAccount{
    void deposit();
    void withdraw();
    void balance();
}
class BankAccount1 implements IBankAccount,IManageAccount{
    @Override
    public void deposit() {
        System.out.println("deposi");
    }
    @Override
    public void withdraw() {
        System.out.println("withdraw");
    }
    @Override
    public void balance() {
        System.out.println("balance");
    }
    @Override
    public void openAccount() {
        System.out.println("open account");
    }
    @Override
    public void closeAccount() {
        System.out.println("close account");
    }
}
class CurrentAccount2 implements IBankAccount,IManageAccount{
    @Override
    public void deposit() {
        System.out.println("deposi");
    }
    @Override
    public void withdraw() {
        System.out.println("withdraw");
    }
    @Override
    public void balance() {
        System.out.println("balance");
    }
    @Override
    public void openAccount() {
        System.out.println("open account");
    }
    @Override
    public void closeAccount() {
        System.out.println("close account");
    }
}
public class Interfaces {
    public  static void main(String[] args) {
        // all members of an interface is public and abstract
        IManageAccount.welcome();
        BankAccount1 bankAccount1 = new BankAccount1();
        bankAccount1.deposit();
        bankAccount1.withdraw();
        bankAccount1.balance();
        bankAccount1.openAccount();
        bankAccount1.closeAccount();
        CurrentAccount2 currentAccount2 = new CurrentAccount2();
        currentAccount2.deposit();
        currentAccount2.withdraw();
        currentAccount2.balance();
        currentAccount2.openAccount();
        currentAccount2.closeAccount();
    }
}
