public class TryCatch {
    public static void main(String [] args){
        try{
        int [] num={0,1,2};
        int a=num[3];
        int b=10/0;
    }/*catch(ArithmeticException e){
        System.out.println("cannot divide by zero");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is out of bound");
    }*/catch(Exception e){
        System.out.println("General "+e.getMessage());
    }finally{
               System.out.println("finally block runs here");
 
    }
        System.out.println("out of try catch block");

    }
}
