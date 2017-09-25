package lab3.b;


/**
 *
* @author FarHad Salehi and Tahir Sabe
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Comparable<Book>,Serializable{
    
    private String isbn;
    private String title;
    private int edition;
    private double price;
    
    private ArrayList<Author> authors = new ArrayList<Author>();
     
    public Book() {
       isbn="";
       title="";
       edition=0;
       price=0;
    }
    
    public Book(String isbn,String title,int edition, double price) {
       this.isbn=isbn;
       this.title=title;
       this.edition=edition;
       this.price=price;
    }
    
    public String getIsbn(){
       return isbn;
    }
    
    public String getTitle(){
       return title;
    }
    
    public int getEdition(){
       return edition;
    }
    
    public double getPrice(){
       return price;
    }
   
    public void addAuthor(Author newAuthor){
       authors.add(newAuthor);
    }
    
    public ArrayList<Author> getAuthors() {
       return (ArrayList<Author>) authors.clone();
    }
        
    public void removeAuthor(Author toRemove) {
    	for(int i=0; i<authors.size(); i++) {
			if(authors.get(i).toString().compareTo(toRemove.toString())== 0){
	    		authors.remove(i);
	    	}
	    	else System.out.println(toRemove + " does not exist among authors");
	    }
    }
    
    
    @Override
	public int compareTo(Book other) {
		if(title.compareTo(other.title)< 0) 
			return -1;
		else if(title.compareTo(other.title)== 0) {
			for(Author author: authors)
			{
				if(author.toString().compareTo(other.authors.toString())> 0) 
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
		String info = "\nBook: "+ title + " " + edition + "th ed.\n";
		if(authors.size() > 0) { 
			for(int i=0; i<authors.size(); i++) {
				info+= " "+authors.get(i).toString()+",";
			}
		}
		info+= "\n ISBN: " + isbn +", price=" + price + "]\n";
		return info;
	}
    
}
