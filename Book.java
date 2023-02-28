/* Write a Java program to create class 'Book'. 
User can add infromation of Book using function.
Bookid, name, author, publisher */
import java.util.Scanner;

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
    
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter book ID: ");
        int bookId = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter book name: ");
        String name = input.nextLine();
        
        System.out.print("Enter book author: ");
        String author = input.nextLine();
        
        System.out.print("Enter book publisher: ");
        String publisher = input.nextLine();
        
        Book book = new Book(bookId, name, author, publisher);
        System.out.println("Book added successfully!");
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Book name: " + book.getName());
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Book publisher: " + book.getPublisher());
    }
}
