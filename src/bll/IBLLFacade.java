/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import be.Student;
import be.Course;
import be.Teacher;

/**
 *
 * @author root
 */
public interface IBLLFacade {
    
    //Status
    Status createStatus();
    
    Status getStatus();
    
    Status updateStatus();
    
    void deleteStatus();
    
    //Student
    Student createStudent();
    
    Student getStudent();
    
    Student updateStudent();
    
    void deleteStudent();
    
    //Teacher
    
    Teacher createTeacher();
    
    Teacher getTeacher();
    
    Teacher updateTeacher();
    
    void deleteTeacher();
    
    //Course
    Course createCourse();
    
    Course getCourse();
    
    Course updateCourse();
    
    void deleteCourse();
}
