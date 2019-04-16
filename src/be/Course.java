/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.util.HashMap;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author root
 */
public class Course {
    
    public final IntegerProperty id;
    public final StringProperty name;
    public HashMap<IntegerProperty, List<Status>> presence;
    
    
    public Course(IntegerProperty id, StringProperty name){
        this.id = id;
        this.name = name;
        this.presence = new HashMap<>();
    }

    public IntegerProperty getId(){
        return id;
    }
    
    public StringProperty getName(){
        return name;
    }
    
    public void addPresence(IntegerProperty id, List<Status> status){
        this.presence.put(id, status);
    }
    
}
