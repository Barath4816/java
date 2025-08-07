package BankingSystem;

public class RegularAccount extends User implements BankInterface{
    private static final double minBalance = 1000;

    public RegularAccount(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    public void createAccount(String name, double initialDeposit) {
    }


    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New Balance: " + getBalance());
    }

    public void withdraw(double amount) throws Exception {
        try {
            if (getBalance() - amount < minBalance) {
                throw new Exception("Insufficient balance!");
            } else {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal successful. New Balance: " + getBalance());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public static double getMinBalance() {
        return minBalance;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }

 
}
