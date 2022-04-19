import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private String address;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void printAvailableBooks(){
        int size = books.size();
        for(Book book : books){
            if(!book.isBorrowed()){
                System.out.println(book.getTitle());
                }
            else {
                size -= 1;
            }
        }
            if(size == 0){
                System.out.println("No book in catalog");
            }
        }


    public void borrowBook(String title){
        String result = "Sorry, this book is not in our catalog.";
        for(Book book : books){
            if(book.getTitle().equals(title)){
                if(!book.borrowed) {
                    book.borrowed();
                    result = "You successfully borrowed "+title;
                }
                else{
                    result ="Sorry, this book is already borrowed.";
                }
            }
        }
        System.out.println(result);
    }

    public void returnBook(String title){
        for(Book book : books){
            if(book.title.equals(title)){
                book.returned();
                System.out.println("You successfully returned " + title);
            }
        }
    }


    // Add the missing implementation to this class
    public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
  
Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("1.Add Book 2.Print Available Books 3.Borrow Book 4.Return Book 5.Exit");
        System.out.println("Enter Your Choice:");
       
        int ch=sc.nextInt();
        switch(ch){
            case 1: 
            System.out.println("In which Library you want to add book 1 or 2:");
            int libNumber=sc.nextInt();
            System.out.println("Enter Book Name to add:");
            String bookName=sc.next();
            if(libNumber==1)
              firstLibrary.addBook(new Book(bookName));
            else if(libNumber==2)
            secondLibrary.addBook(new Book(bookName));
            else 
            System.out.println("No Library Available");

            break;

            case 2:
            System.out.println("From which Library you want to print books 1 or 2:");
            int libNum=sc.nextInt();
            if(libNum==1){
             if(firstLibrary.books.size()!=0)
              firstLibrary.printAvailableBooks();
            
            else 
             System.out.println("No Books Available");
            }
            else {
             if(secondLibrary.books.size()!=0)
             secondLibrary.printAvailableBooks();
             
             else 
             System.out.println("No Books Available");
            }

            break;

            case 3:
            System.out.println("From which Library you want to borrow book 1 or 2:");
            int libNum1=sc.nextInt();

            System.out.println("Enter Book Name to borrow:");
            String title1=sc.next();

            if(libNum1==1)
            firstLibrary.borrowBook(title1);
            else 
            secondLibrary.borrowBook(title1);

            break;

            case 4:
            System.out.println("To which Library you want to return book 1 or 2:");
            int libNum2=sc.nextInt();

            System.out.println("Enter Book Name to return:");
            String title2=sc.next();

            if(libNum2==1)
            firstLibrary.returnBook(title2);
            else 
            secondLibrary.returnBook(title2);
            break;
            default:
            System.out.println("Exiting from Library");
            System.exit(0);



        }
        
     }
 }
}
