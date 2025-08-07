package BankingSystem;

abstract class User {
  private  String accountHolderName ;
  private int accountNumber; 
 private double balance ;
  static int userCount = 0;
 private static int accountNumberCount=1000;
 User(String accountHolderName,double balance){
    this.accountHolderName =accountHolderName ;
    this.balance=balance;
    accountNumber=accountNumberCount++;
    userCount++;
 }
 

 public String getAccountHolderName() {
    return accountHolderName;
}


 public int getAccountNumber() {
    return accountNumber;
 }


 public double getBalance() {
    return balance;
 }


 public static int getUserCount() {
    return userCount;
 }
 


 public void setBalance(double balance) {
   this.balance = balance;
}


 abstract void displayDetails();
}
