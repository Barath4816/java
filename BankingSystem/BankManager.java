package BankingSystem;

public class BankManager {
       static User[] users = new User[5];

    public static User getUserByAccountNumber(int accNo) {
        for (User user : users) {
            if (user != null && user.getAccountNumber() == accNo) {
                return user;
            }
        }
        return null;
    }
}
