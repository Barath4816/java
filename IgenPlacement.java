import java.util.*;
class IgenPlacement{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        findarea(sc);
       
    }
    static void findarea(Scanner sc){    
          System.out.println("1.Rectangle");
          System.out.println("2.Square");
          System.out.println("3.triangle");
             int n=sc.nextInt();
             System.out.println("Length and Breadth");
             int length=sc.nextInt();
             int breadth=sc.nextInt();
             switch(n){
                case 1:
                System.out.println("area "+length*breadth);
                break;
                case 2:
                System.out.println("area "+length*breadth);
                break;
                case 3:
                System.out.println("area "+0.5*length*breadth);
                break;
                default:
                System.out.println("Enter correct input");
             }
             sc.close();
    }
}