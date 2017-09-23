/**
 *
* @author FarHad Salehi and Tahir Sabe
 */

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class UserInterface implements Serializable {

	private Scanner scan;
	CollectionOfBooks collectionOfBooks = new CollectionOfBooks();
	CollectionOfBooksHelpWithSerialization ser = new CollectionOfBooksHelpWithSerialization();

    public UserInterface() {
    	scan = new Scanner(System.in);
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
    			case 'T':	getBooksByTitle("tillfällig"); break;
    			case 'W':	getBooksByAuthor("tillfällig"); break;
    			case 'I':	getBooksByISBN("tillfällig"); break;
    			case 'Z':	getAllBooks(); break;
    			case 'X':	ser.serializeToFile("Fil1.ser");
    						System.out.println("Bye, bye!"); break;
    			default: 	System.out.println("Unknown command");
    		}	
    	} while(choice != 'X');
    }
    
    public void addBook() {
    	String isbn,title,name;
    	int edition;
    	double price;
    	
    	Book book = new Book();
    	Author newAuthor = new Author();
    	
    	System.out.println("input in this order: ISBN, title, edition, "
    			+ "\nprice & Author");
    	isbn = scan.nextLine();
    	title = scan.nextLine();
    	edition = Integer.parseInt(scan.nextLine());
    	price = Double.parseDouble(scan.nextLine());
    	book = new Book(isbn,title,edition,price);
    	name = scan.nextLine();
    	newAuthor = new Author(name); 
    	book.addAuthor(newAuthor);
    	collectionOfBooks.addBook(book);
    }
    
    public void removeBook() {
    	collectionOfBooks.removeBook(null);
    }
    
    public void getBooksByTitle(String title) {
    	collectionOfBooks.getBooksByTitle(title);
    }

    public void getBooksByAuthor(String author) {
    	collectionOfBooks.getBooksByAuthor(author);
    }
    
    public void getBooksByISBN(String isbn) {
    	collectionOfBooks.getBooksByISBN(isbn);
    }
    
    public void getAllBooks() {
    	collectionOfBooks.toString();
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
    	collectionOfBooks = new CollectionOfBooks(ser.getTheBooks());
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
    	UserInterface menu = new UserInterface();
    	menu.chooseFile();
    	menu.run();
    } 
}