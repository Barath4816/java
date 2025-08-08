public class student extends college {
    int regnumber;
    String name;
    student(String name,int regnumber,String collegeName){
       super(collegeName);
        this.regnumber=regnumber;
        this.name=name;
      
    }
    void studentprint(){
        System.out.println("name "+name);
        System.out.println("Reg.no "+regnumber);
         
    }

}

