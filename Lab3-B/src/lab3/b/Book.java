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
public class Book implements Comparable<Book>{
    
    private String isbn;
    private String title;
    private int edition;
    private double price;
    
    private ArrayList<Author> authors = new ArrayList<>();
     
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
    
    public ArrayList<Author> getAuthor()
    {
       return (ArrayList<Author>) authors.clone();
    }
    
    public Author getAuthor(Author x)
    {
    	for(int i=0; i<authors.size(); i++) {
			if(x.equals(authors.get(i))){
				return(authors.get(i));
			}
		}
    	return x;
    }
    
    public void removeAuthor(Author x)
    {
    	for(int i=0; i<authors.size(); i++) {
			if(x.equals(authors.get(i))){
				authors.remove(i);
			}
    	}
    }
    
    
    @Override
	public int compareTo(Book other) {
		if(title.compareTo(other.title)< 0) 
			return -1;
		else if(title.compareTo(other.title)== 0) {
			for(Author author: authors)
			{
				if(author.toString().compareTo(other.authors.toString())< 0)
					return -1;
				else if(author.toString().compareTo(other.authors.toString())== 0)
					return 0;
				else 
					return 1;				
			}
			return 0;
		} 
		else 
			return 1;
	}
	
	@Override
	public String toString() {
		String info = "Book [isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", price=" + price + "]";
		if(authors.size() > 0) { 
			for(int i=0; i<authors.size(); i++) {
				info+= " "+authors.get(i).toString()+",";
			}
		}
		return info;
	}
    
}
