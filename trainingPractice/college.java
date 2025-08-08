public class college {
     static int code=1000;
     String collegeName;
     int collegeCode;

college(String collegeName){
        
        collegeCode=code++;
        this.collegeName=collegeName;
    }
      void collegeprint(){
        System.out.println("College code "+collegeCode);
         System.out.println("college name "+collegeName);
         
    }}
