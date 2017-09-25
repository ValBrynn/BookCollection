package lab3.b;

/**
 *
* @author FarHad Salehi and Tahir Sabe
 */

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class UserInterface implements Serializable {

	private Scanner scan= new Scanner(System.in);
	private CollectionOfBooks collectionOfBooks;
	private CollectionOfBooksHelpWithSerialization ser;
        

    public UserInterface() {
    	scan = new Scanner(System.in);
        collectionOfBooks = new CollectionOfBooks();
        ser = new CollectionOfBooksHelpWithSerialization();
    }
   
    public void run() throws ClassNotFoundException, IOException {
    	char choice = ' ';
    	String answer;
    	
    	do {
    		printMenu();
    		answer = scan.nextLine();
    		answer = answer.toUpperCase();
    		choice = answer.charAt(0);
    		
    		switch(choice) {
    			case 'A':	addBook(); break;
    			case 'R':	removeBook(); break;
                                        
                        case 'T':
                                        
                                        System.out.println("Enter Title:  ");
    				        getBooksByTitle(scan.nextLine()); break;
    			case 'W':
                                        System.out.println("Enter Author:  ");
                                        getBooksByAuthor(scan.nextLine()); break;
    			case 'I':	
                                        System.out.println("Enter ISBN:  ");
                                        getBooksByISBN(scan.nextLine()); break;
    			case 'Z':	System.out.println(getAllBooks()); break;
    			case 'X':	System.out.println(this.getAllBooks());
                                        ser.setTheBooks(collectionOfBooks.getTheBooks());
                                        ser.serializeToFile("Fil1.ser");
    					System.out.println("Exiting..!"); break;
    			default: 	System.out.println("Unknown command");
    		}	
    	} while(choice != 'X');
    }
    
    public void addBook() {
    	String isbn,title,name;
    	int edition;
    	double price;
    	
    	System.out.println("input in this order: ISBN, title, edition, "
    			+ "\nprice & Author");
    	isbn = scan.nextLine();
    	title = scan.nextLine();
    	edition = Integer.parseInt(scan.nextLine());
    	price = Double.parseDouble(scan.nextLine());
    	Book book = new Book(isbn,title,edition,price);
    	name = scan.nextLine();
    	Author newAuthor = new Author(name); 
    	book.addAuthor(newAuthor);
    	collectionOfBooks.addBook(book);
            
    }
    
    public void removeBook() {
    	collectionOfBooks.removeBook(null);
    }
    
    public void getBooksByTitle(String title){ 
       
        System.out.println(collectionOfBooks.getBooksByTitle(title).toString());
    }

    public void getBooksByAuthor(String author) {
        System.out.println((collectionOfBooks.getBooksByAuthor(author).toString()));
    }
    
    public void getBooksByISBN(String isbn) {
    	   System.out.println(collectionOfBooks.getBooksByISBN(isbn).toString());
    }
    
    public String getAllBooks() {
    	  return collectionOfBooks.toString();
    }
    
    public void printMenu() {
    	System.out.println("---Menu---");
    	System.out.println("A To Add a Book");
    	System.out.println("R To Remove a Book");
    	System.out.println("T To get Books by a given Title");
    	System.out.println("W To get Books by a given Writer");
    	System.out.println("I To get Books by a given ISBN");
    	System.out.println("Z To get All Books");
    	System.out.println("X Exit");
    	System.out.println("----------");
    }
    
    public void chooseFile() throws ClassNotFoundException, IOException {
    	String answer = "Fil1";
    	System.out.println("\nChoose a filename:");
    	//answer += scan.nextLine();
    	answer += ".ser";
    	System.out.println(answer);
    	ser.deSerializeFromFile(answer);
        System.out.println(this.getAllBooks());
    	collectionOfBooks = new CollectionOfBooks(ser.getTheBooks());
        System.out.println(this.collectionOfBooks);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
    	UserInterface menu = new UserInterface();
    	menu.chooseFile();
    	menu.run();
    } 
}