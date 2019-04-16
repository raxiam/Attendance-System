/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author root
 */
public class Student extends User{

        private final List<LocalDate> presence;
        private IntegerProperty courseId;
        

        public Student(IntegerProperty id, StringProperty name, IntegerProperty courseId){
            super(id, name, UserType.STUDENT);
            this.presence = new ArrayList();
            this.courseId = courseId;
        }
        
        
        public List<LocalDate> getStatus(){
            return this.presence;
        }
        
        public void addStatus(LocalDate status){
            this.presence.add(status);
        }

}
