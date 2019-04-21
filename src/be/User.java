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

    private Integer id;
    private String name;
    private final UserType type;
        
        
    public User(Integer id, String name, UserType type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
        
        
    public void setId(Integer id){
        this.id = id;
    }
        
    public void setName(String name){
        this.name = name;
    }
        
    public Integer getId(){
        return this.id;
    }
        
    public String getName(){
        return this.name;
    }
    
    public UserType getType(){
        return this.type;
    }
}
