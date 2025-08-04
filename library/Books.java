package library;
public class Books extends items {
 
    private String genre;
    Books(String bookName,String authorName,String genre){
         super(bookName,authorName);
        this.genre=genre;
    }
    public void display(){
        System.out.println("BookName:"+getBookName());
        System.out.println("AuthorName:"+getAuthorName());
        System.out.println("Genre:"+genre);
    }
 }
