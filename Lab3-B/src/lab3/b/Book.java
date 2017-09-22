/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b;

import java.util.ArrayList;

/**
 *
 * @author FarHad Salehi and Tahir Sabe
 */
public class Book implements Comparable<String>{
    
    private String isbn;
    private String title;
    private int edition;
    private double price;
    
    private ArrayList<Author> authors;
     
    public Book()
    {
       isbn="";
       title="";
       edition=0;
       price=0;
    }
    
    public Book(String isbn,String title,int edition, double price  )
    {
       this.isbn=isbn;
       this.title=title;
       this.edition=edition;
       this.price=price;
    }
    
    public String getIsbn()
    {
       return isbn;
    }
    
    public String getTitle()
    {
       return title;
    }
    
    public int getEdition()
    {
       return edition;
    }
    
    public double getPrice()
    {
       return price;
    }
   
    public void addAuthor(Author newAuthor)
    {
       authors.add(newAuthor);
    }
    
    
    
	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", price=" + price + "]";
	}
    
}
