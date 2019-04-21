/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import be.Teacher;
/**
 *
 * @author root
 */
public class TeacherDao {
    public Teacher createTeacher(Integer id, String name){
        return new Teacher(id, name);
    }
}
