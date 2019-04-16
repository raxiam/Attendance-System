/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author root
 */
public class User{
	
    public enum UserType{
        STUDENT,
        TEACHER
    }
    private IntegerProperty id;
    private StringProperty name;
    private final UserType type;
        
        
    public User(IntegerProperty id, StringProperty name, UserType type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
        
        
    public void setId(IntegerProperty id){
        this.id = id;
    }
        
    public void setName(StringProperty name){
        this.name = name;
    }
        
    public IntegerProperty getId(){
        return id;
    }
        
    public StringProperty getName(){
        return name;
    }
    
    public UserType getType(){
        return type;
    }
}
