package Inheritance;
public class Main {
    public static void main(String[] args) {
        Owner detail = new Owner(
            "Four Wheeler",     
            "Ferrari",              
            "X5",                
            "Diesel",        
            "Automatic",         
            4,                
            "Barath",           
            "9876543210",        
            "TN123456"          
        );
        detail. start();
         detail. stop();
        detail.Display(); // Show all details
    } }
