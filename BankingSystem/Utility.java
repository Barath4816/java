package BankingSystem;

public class Utility {
      public static void printSeparator() {
        System.out.println("-----------------------------");
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
