public class Department extends student{
    String deptName;
    Department(String deptName,String name,int regnumber,String collegeName){
       super(name, regnumber, collegeName);
        this.deptName=deptName;
    }
void deptprint(){ 
        System.out.println("Department Name "+deptName);
         
    }

}
