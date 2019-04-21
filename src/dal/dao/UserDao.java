package dal.dao;

import be.User;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserDao {

    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();

        while(rs.next()){
            //take shit and fill list
            //users.add();
        }
        return users;
    }
}
