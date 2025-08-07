package BankingSystem;

import java.util.*;

public class BankMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                Utility.printSeparator();
                System.out.println("----- Welcome to OOPS Bank -----");
                System.out.println("1. Create Account\n2. Deposit Money\n3. Withdraw Money\n4. Check Balance\n5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (User.userCount >= 5) {
                            System.out.println("User limit reached!");
                            break;
                        }
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        double initialDeposit = 0;
                        System.out.print("Account Type (1-Regular / 2-Premium): ");
                        int type = sc.nextInt();

                        if (type == 1) {
                            BankManager.users[User.userCount] = new RegularAccount(name, initialDeposit);
                        } else {
                            BankManager.users[User.userCount] = new Premium(name, initialDeposit);
                        }
                        System.out.println("Account Created. Account Number: " + BankManager.users[User.userCount - 1].getAccountNumber());
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        User user = BankManager.getUserByAccountNumber(accNo);
                        if (user == null) {
                            System.out.println("Account not found!");
                            break;
                        }
                        System.out.print("Enter Amount to Deposit: ");
                        double amt = sc.nextDouble();
                        if (!Utility.isValidAmount(amt)) {
                            System.out.println("Invalid amount!");
                            break;
                        }
                        ((BankInterface) user).deposit(amt);
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accNo2 = sc.nextInt();
                        User user2 = BankManager.getUserByAccountNumber(accNo2);
                        if (user2 == null) {
                            System.out.println("Account not found!");
                            break;
                        }
                        System.out.print("Enter Amount to Withdraw: ");
                        double amt2 = sc.nextDouble();
                        if (!Utility.isValidAmount(amt2)) {
                            System.out.println("Invalid amount!");
                            break;
                        }
                        ((BankInterface) user2).withdraw(amt2);
                        break;
                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accNo3 = sc.nextInt();
                        User user3 = BankManager.getUserByAccountNumber(accNo3);
                        if (user3 == null) {
                            System.out.println("Account not found!");
                            break;
                        }
                        user3.displayDetails();
                        break;
                    case 5:
                        System.out.println("Thank you for using OOPS Bank.");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            } finally {
                System.out.println("Transaction completed.\n");
            }
        }
    }
}
