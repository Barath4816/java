package EmployeeMaintanance;

import java.util.Scanner;

public class Main2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Utility.instruction(); 

        AttendanceEmployee[] employees = new AttendanceEmployee[4];  

        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

          
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

        
            AttendanceEmployee emp = new AttendanceEmployee(name, id, dept);

         
            emp.markAttendance(new int[7]);

         
            employees[i] = emp;
        }

        System.out.println("\n---------------------------------------------");

      
        for (AttendanceEmployee emp : employees) {
            System.out.println("\nEmployee Details:");
            emp.showDetail();          
            emp.displayAttendance();    
        }

        System.out.println("---------------------------------------------");

       sc.close();
}}
