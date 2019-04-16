/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import be.Status;
import java.time.LocalDate;
import java.time.LocalTime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author root
 */
public class BreakdownViewModel {
    
    //private static BreakdownViewModel instance;
    private ObservableList<Status> statusList;
    
    public BreakdownViewModel(){
        statusList = FXCollections.observableArrayList();
    }
    
    /*public static BreakdownViewModel getInstance(){
        if(instance == null){
            instance = new BreakdownViewModel();
        }
        return instance;
    }*/
    
    public ObservableList<Status> getStatusList(){
        //hard data
        for(int i = 0; i < 15; i++){
        
        LocalDate d1 = LocalDate.now();
        LocalTime t1 = LocalTime.now();
        Status s = new Status(d1, t1, true);
        
        statusList.add(s);
        }
        return statusList;
    }
    
}
