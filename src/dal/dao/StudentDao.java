/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import be.Status;
import be.Student;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class StudentDao {
    public Student createStudent(Integer id, String name, Integer courseId, ArrayList<Status> presence){
        return new Student(id, name, courseId, presence);
    }
}
