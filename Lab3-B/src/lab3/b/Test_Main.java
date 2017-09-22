package lab3.b;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Main {
	
	public static void main(String[] args) {
	Book book1 = new Book("1241543456","Introduction to C Programming",9,500);
	Book book2 = new Book("4843524687","Introduction to C Programming",14,300);
	
	Author farhad = new Author("Farhad");
	Author armin = new Author("Armin Halilovic");
	Author johnny = new Author("Crazy OS Guy");
    
        
	
	System.out.println(book1.toString());
	book1.addAuthor(armin);
    book1.addAuthor(farhad);
    book2.addAuthor(johnny);
	System.out.println(book1.toString());
	
    ArrayList<Book> booklist = new ArrayList<>();
    booklist.add(book1);
    booklist.add(book2);
    CollectionOfBooks cb= new CollectionOfBooks(booklist);
    //System.out.println(cb);
    //book1.removeAuthor(armin);	
	Collections.sort(booklist);
	System.out.println(cb);
	
	}
}
