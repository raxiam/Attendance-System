/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import be.*;
import dal.dao.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class DALManager implements IDALFacade{

    CourseDao cDao;
    StudentDao sDao;
    TeacherDao tdao;

    DALManager(){
        cDao = new CourseDao();
        sDao = new StudentDao();
        tdao = new TeacherDao();
    }

    @Override
    public Student getStudent(int id){}

    @Override
    public List<Student> getAllStudent(int courseId){}

    @Override
    public Course getCourse(int courseId){}

    @Override
    public List<User> getAllUser(){}

    @Override
    public User getUser(int id){}

    @Override
    public Course createCourse(Integer id, String name, LocalDate start, LocalDate end, DayOfWeek[] weekDays){
        return cDao.createCourse(id, name, start, end, weekDays);
    }

    @Override
    public Student createStudent(int id, String name, int courseId, ArrayList<Status> presence){
        return sDao.createStudent(id, name, courseId, presence);
    }

    @Override
    public Teacher createTeacher(int id, String name){
        return tdao.createTeacher(id, name);
    }

    @Override
    public void updateStudent(List<Status> presence){}


}
