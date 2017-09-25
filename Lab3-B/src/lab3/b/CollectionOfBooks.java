package lab3.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CollectionOfBooks implements Serializable{
    
    private ArrayList<Book> books;
            
    public CollectionOfBooks() {
    	books = new ArrayList<Book>();    	
    }
    
    public CollectionOfBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public int getNrOfBooks() {
    	return books.size();
    }
            
    public void addBook(Book addedBook){
        
    	books.add(addedBook);
        
    }
    
    public void removeBook(Book removedBook){
    	books.remove(removedBook);
    }
    
    public List<Book> getBooksByTitle(String title){
    	ArrayList<Book> refOfBooks = new ArrayList<>();
    	for(Book b : books) {
        	if(b.getTitle().equals(title)) {
        		refOfBooks.add(b);
        	}
        }
    	return refOfBooks;
    }
    
    public List<Book> getBooksByAuthor(String author){
    	ArrayList<Book> refOfBooks = new ArrayList<>();
    	ArrayList<Author> authorlist = new ArrayList<>();
    	for(Book b : books) {
    		authorlist = b.getAuthors();
    		for(Author a : authorlist) {    	    	
	    		if(a.getName().equals(author)) {
	        		refOfBooks.add(b);
	        	}
    		}
        }
    	return refOfBooks;
    }
    
    public List<Book> getBooksByAuthor(Author author){
    	ArrayList<Book> refOfBooks = new ArrayList<>();
    	ArrayList<Author> authorlist = new ArrayList<>();
    	for(Book b : books) {
    		authorlist = b.getAuthors();
        	if(authorlist.contains(author)) {
        		refOfBooks.add(b);
        	}
        }
    	return refOfBooks;
    }

    public List<Book> getBooksByISBN(String isbn){
    	ArrayList<Book> refOfBooks = new ArrayList<>();
    	for(Book b : books) {
        	if(b.getIsbn().equals(isbn)) {
        		refOfBooks.add(b);
        	}
        }
    	return refOfBooks;
    }
    
    public ArrayList<Book> getTheBooks() {
		return books;
	}

    
    public String toString() {
        String info =" " + books;
        return info;
    }
    
}
