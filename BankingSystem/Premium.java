package BankingSystem;

public class Premium extends RegularAccount {
     public Premium(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    public void withdraw(double amount) throws Exception {
        setBalance(getBalance() - amount);
        if (getBalance() < getMinBalance()) {
            System.out.println("Withdrawal successful. Warning: Balance below minimum!");
        } else {
            System.out.println("Withdrawal successful. New Balance: " + getBalance());
        }
    }

    public void getBonus() {
        System.out.println("Bonus credited!");
    }
    
}
