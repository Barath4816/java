package Agregation;

public class Student {
    private String studentName;
    private Depart[] depart;
    Student(String studentName,Depart[] depart){
        this.studentName=studentName;
        this.depart=depart;
    }
    void showStudent(){
        System.out.println("Student name:"+studentName);
        for(Depart d:depart){
            d.showDepart();
        }
    }
}
