/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Student extends User{

        private final List<Status> presence;
        private Integer courseId;
        

        public Student(Integer id, String name, Integer courseId, ArrayList<Status> presence){
            super(id, name, UserType.STUDENT);
            this.presence = presence;
            this.courseId = courseId;
        }
        
        
        public List<Status> getStatus(){
            return this.presence;
        }

        public void addStatus(Status status){
            this.presence.add(status);
        }

}
