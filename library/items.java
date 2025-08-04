package library;

abstract class items {
      private String bookName;
   private String authorName;
    items(String bookName,String authorName){
        this.bookName=bookName;
        this.authorName=authorName;
        
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    abstract void display();
}
