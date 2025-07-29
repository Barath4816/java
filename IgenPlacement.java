import java.util.*;
class IgenPlacement{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        sample();
       // findarea(sc);
        //trianglepattern(sc);
        //swapping();
        //swapping3();
        //calculation(sc);
       sc.close();
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
    }
    static void trianglepattern(Scanner sc){
        System.out.println("Enter no.rows:");
        int n= sc.nextInt();
        for(int i =0;i<n;i++,System.out.println()){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i+1 +" ");
            }
        }
    }
    static void swapping(){
    int a=10;
    int b=90;
    a=a-b;
    b=b+a;
    a=b-a;
    System.out.println(a);
    System.out.println(b);
    }
    static void swapping3(){
    int a=10;
    int b=90;
    int c=80;
    c=(a+b+c)-(a=b)-(b=c);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    }
    static void sample(){

       String s="asdfghjklwertyuio";
       System.out.println(s.substring(0,10));
       int n=80;
       if((n&1)==1)
			System.out.println("odd");
		else
			System.out.println("Even");
    }
    
    static void calculation(Scanner sc){
        System.out.println("1.Addition");
        System.out.println("2.subraction")
    }
}