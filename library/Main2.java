package library;

public class Main2 {
    public static void main(String[]args){
       // Borrower obj=new Borrower("Barath","15/2/26","lessons","Barath Raj","life");
      //  obj.displayAll();
        items arr[]=new items[3];
        arr[0]=new Borrower("Barath","15/2/26","lessons","Barath Raj","life");
        arr[1]=new Books("HPotter","JK","Magic");
        arr[0].display();
        arr[1].display();
    
    }
}
