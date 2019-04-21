/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import be.Course;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author root
 */
public class CourseDao {

    public Course createCourse(int id, String name, LocalDate start, LocalDate end, DayOfWeek[] weekDays){
        return new Course(id, name, start, end, weekDays);
    }
}
