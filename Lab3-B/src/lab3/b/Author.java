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
public class Author {

    private String name;
    
    public Author()
    {
       name= "";
    }
    
    public Author( String name )
    {
       this.name=name;
    }
    
    public String getName()
    {
       return name;
    }
          
    public void setNewName(String name)
    {
        this.name=name;
    }
    
    public String toString()
    {
       return "Author: "+name;
    }
}