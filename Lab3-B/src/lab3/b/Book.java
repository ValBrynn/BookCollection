/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.b;

/**
 *
 * @author FarHad Salehi and Tahir Sabe
 */
public class Book {
    
    private String isbn;
    private String title;
    private int edition;
    private double price;
     
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
    
}
