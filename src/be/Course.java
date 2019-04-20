/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author root
 */
public class Course {
    
    public final IntegerProperty id;
    public final StringProperty name;
    public List<LocalDate> courseDays;
    public HashMap<IntegerProperty, List<Status>> presence;
    
    
    public Course(IntegerProperty id, StringProperty name){
        this.id = id;
        this.name = name;
        this.presence = new HashMap<>();
	this.courseDays = new ArrayList();
    }

    public IntegerProperty getId(){
        return this.id;
    }
    
    public StringProperty getName(){
        return this.name;
    }

    public HashMap<IntegerProperty, List<Status>> getPresence(){
    	return this.presence;
    }
   
    public List<LocalDate> getDays(){
    	return this.courseDays;
    }

    public void addPresence(IntegerProperty studentId, List<Status> status){
        this.presence.put(studentId, status);
    }

    public void setDays(List<LocalDate> days){
    	this.courseDays = days;
    }
    
}
