package EmployeeMaintanance;

public class Employee extends Person {
    private String department;
   private static int count=0;
   
    Employee(String name,int id, String department){
        super(name, id);
        this.department=department;
       count++;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    void showDetail(){
        
        System.out.println("Name: "+getName());
        System.out.println("Id: "+getId());
        System.out.println("Department"+getDepartment());
    }
 static void showEmpCount(){
    System.out.println("Total Employees Created: "+count);
 }
}
