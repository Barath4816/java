package library;

public class Borrower extends Books{
   private String borrowerName;
   private String dueDate;

Borrower(String borrowerName,String dueDate,String bookName,String authorName,String genre){
    super(bookName,authorName,genre);
    this.borrowerName=borrowerName;
    this.dueDate=dueDate;
}
public void display(){
    super.display();
    System.out.println("Borrower Name:"+borrowerName);
    System.out.println("Due Date:"+dueDate);
}
}