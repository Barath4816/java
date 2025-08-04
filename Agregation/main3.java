package Agregation;

public class main3 {
    public static void main(String[]args){
        Depart d1=new Depart("Aiml",115);
        Depart d2=new Depart("CSE",112);
        Depart[] arr={d1,d2};
        Student s1=new Student("BarathRaj",arr);
        s1.showStudent();
    }
}
