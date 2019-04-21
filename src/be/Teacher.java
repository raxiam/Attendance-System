/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author root
 */
public class Teacher extends User{
    
    public List<Course> courses;
    
    
    public Teacher(Integer id, String name){
        super(id, name, UserType.TEACHER);
        courses = new ArrayList();
    }
    
    
    public List<Course> getCourses(){
        return courses;
    }
    
    public void addCourse(Course course){
        this.courses.add(course);
    }
    
}
