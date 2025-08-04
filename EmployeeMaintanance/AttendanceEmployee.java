package EmployeeMaintanance;

import java.util.Scanner;

public class AttendanceEmployee extends Employee implements Markable{
     private int[] attendanceArray = new int[7];
    AttendanceEmployee (String name,int id, String department){
        super( name,id, department);
    }
      public void markAttendance(int[] attendanceArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Attendance (7 values of 0/1): ");

      
        for (int i = 0; i < 7; i++) {
            int val;
            do {
                val = sc.nextInt();  
            } while (val != 0 && val != 1);  

            attendanceArray[i] = val;
        }

      
        this.attendanceArray = attendanceArray;
         sc.close();
    }

   
    @Override
    public int calculatePresentDays(int[] attendanceArray) {
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (attendanceArray[i] == 1) {
                count++;
            }
        }
        return count;
    }

    
    public void displayAttendance() {
        System.out.print("Attendance: [");
        for (int i = 0; i < 7; i++) {
            System.out.print(attendanceArray[i]);
            if (i < 6) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Total Present Days: " + calculatePresentDays(attendanceArray));
       
    }
}