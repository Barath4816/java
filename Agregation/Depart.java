package Agregation;

public class Depart {
    private String departmentName;
    private int deptId;
    Depart(String departmentName,int deptId){
        this.departmentName=departmentName;
        this.deptId=deptId;
    }
    void showDepart(){
        System.out.println("Department Name:"+departmentName);
        System.out.println("DeptId:"+deptId);
    }
}
