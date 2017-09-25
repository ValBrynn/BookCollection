package lab3.b;

import java.io.Serializable;

public class Author implements Serializable{

    private String name;
    
    public Author() {
       name= "";
    }
    
    public Author( String name ) {
       this.name=name;
    }
    
    public String getName() {
       return name;
    }
          
    public void setNewName(String name) {
        this.name=name;
    }
    
    public String toString() {
       return name;
    }
}
