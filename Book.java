/* Write a Java program to create class 'Book'. 
User can add infromation of Book using function.
Bookid, name, author, publisher */
public class Book {
    private int bookId;
    private String name;
    private String author;
    private String publisher;
    
    public Book(int bookId, String name, String author, String publisher) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public int getBookId() {
        return bookId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public static void main(String[] args) {
        // Example usage:
        Book myBook = new Book(123, "The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        System.out.println(myBook.getName() + " by " + myBook.getAuthor() + " (published by " + myBook.getPublisher() + ")");
    }
}
