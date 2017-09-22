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
 * @author FarHad
 */
public class CollectionOfBooks {
    
    private Book book;
    private ArrayList<Book> books;
            
//    public CollectionOfBooks(Book book){
//    
//      books.add(book);
//    }
    
    public CollectionOfBooks(ArrayList<Book> addedBooks)
    {
        books=addedBooks;
    }
    
    public int getNrOfBooks()
    {
       return books.size();
    }
            
    public void addBook(Book book)
    {
      books.add(book);
    }
    
    public List<Book> getBooksByTitle(String title)
    {
        return (ArrayList<Book>) books.clone();
    }
    
    
    public String toString()
    {
        
        String info =" "+books;
        
        return info;
    
    }
    
}
