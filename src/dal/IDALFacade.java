/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import be.Course;
import be.Student;
import be.Teacher;

/**
 *
 * @author root
 */
public interface IDALFacade {
    
    //Status
    public Status createStatus();
    
    public Status getStatus();
    
    public Status updateStatus();
    
    public void deleteStatus();
    
    //Student
    public Student createStudent();
    
    public Student getStudent();
    
    public Student updateStudent();
    
    public void deleteStudent();
    
    //Teacher
    public Teacher createTeacher();
    
    public Teacher getTeacher();
    
    public Teacher updateTeacher();
    
    public void deleteTeacher();
    
    //Course
    public Course createCourse();
    
    public Course getCourse();
    
    public Course updateCourse();
    
    public void deleteCourse();
}
