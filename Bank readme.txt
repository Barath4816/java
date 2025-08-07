BankInterface

bank account must support (like deposit, withdraw, and display details).

User (Abstract Class)

Stores properties of every user (name, account number, balance).

 RegularAccount
Implements all bank operations with rules like maintaining a minimum balance of ₹1000.

Uses try-catch with throw to handle errors such as insufficient balance.

 PremiumAccount
Inherits from RegularAccount but allows withdrawing below the minimum balance with a warning.

Adds an extra method getBonus() for premium users.

BankManager
Manages an array of up to 5 users and keeps track of how many users are created.

Provides methods to create, search, and perform actions on user accounts.

Utility
Contains reusable static methods like input validation and printing separator lines and check whether the given amount>0.


BankAppMain
Contains the main() method and the whole program using a switch for 5 cases.

Uses try-catch-finally.