/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import be.*;

/**
 *
 * @author root
 */
public interface IDALFacade {
    
    Student getStudent(int id);

    List<Student> getAllStudent(int courseId);

    Course getCourse(int courseId);

    List<User> getAllUser();

    User getUser(int id);

    Course createCourse(Integer id, String name, LocalDate start, LocalDate end, DayOfWeek[] weekDays);

    Student createStudent(int id, String name, int courseId, ArrayList<Status> presence);

    Teacher createTeacher(int id, String name);

    void updateStudent(List<Status> presence);

}
