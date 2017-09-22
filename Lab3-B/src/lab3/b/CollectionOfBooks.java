/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b;

import java.util.ArrayList;
import java.util.List;

/**
 *
* @author FarHad Salehi and Tahir Sabe
 */
public class CollectionOfBooks{
    
    private ArrayList<Book> books;
            
    public CollectionOfBooks() {
    	books = new ArrayList<>();    	
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
    
    public void removeBook(Book addedBook){
    	books.remove(addedBook);
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

    
    public String toString() {
        String info =" " + books;
        return info;
    }
    
}
