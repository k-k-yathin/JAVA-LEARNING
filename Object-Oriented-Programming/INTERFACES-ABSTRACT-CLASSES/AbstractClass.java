abstract class ManageBank{
    abstract void openAccount();

    abstract void closeAccount();
}
abstract class BankAccount extends ManageBank {
    void Welcome() {
        System.out.println("Welcome to Bank Account");
    }
    abstract void deposit();

    abstract void withdraw();

    abstract void transfer();
}
class SavingsAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("DEPOSIT");
    }
    @Override
    void withdraw() {
        System.out.println("WITHDRAW");
    }
    @Override
    void transfer() {
        System.out.println("TRANSFER");
    }
    @Override
    void openAccount() {
        System.out.println("OPEN ACCOUNT");
    }
    @Override
    void closeAccount() {
        System.out.println("CLOSE ACCOUNT");
    }
}
class CurrentAccount extends BankAccount {
    @Override
    void deposit() {
        System.out.println("DEPOSIT");
    }
    @Override
    void withdraw() {
        System.out.println("WITHDRAW");
    }
    @Override
    void transfer() {
        System.out.println("TRANSFER");
    }
    @Override
    void openAccount() {
        System.out.println("OPEN ACCOUNT");
    }
    @Override
    void closeAccount() {
        System.out.println("CLOSE ACCOUNT");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // a special type of class which cannot be instantiated
        // act as a base class for other classes i.e derived classes
        // members can be abstract and non - abstract
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.Welcome();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.transfer();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.Welcome();
        currentAccount.deposit();
        currentAccount.withdraw();
        currentAccount.transfer();
    }
}
