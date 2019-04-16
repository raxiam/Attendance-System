/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller;

import be.Status;
import gui.model.BreakdownViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author root
 */
public class BreakdownViewController implements Initializable {

    private BreakdownViewModel breakdownModel;
    
    @FXML
    private TableView<Status> tblBreakdown;
    @FXML
    private TableColumn<Status, IntegerProperty> colDate;
    @FXML
    private TableColumn<Status, StringProperty> colDay;
    @FXML
    private TableColumn<Status, StringProperty> colStatus;
    @FXML
    private TableColumn<Status, StringProperty> colTime;

    

    /**
     * Initializes the controller class.
     */
    
    public BreakdownViewController() {
        breakdownModel = new BreakdownViewModel();
    }    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData();
        
    }    
    
    public void loadData(){
        colDate.setCellValueFactory(new PropertyValueFactory("date"));
        colDay.setCellValueFactory(new PropertyValueFactory("day"));
        colStatus.setCellValueFactory(new PropertyValueFactory("status"));
        colTime.setCellValueFactory(new PropertyValueFactory("time"));
        tblBreakdown.setItems(breakdownModel.getStatusList());
    }
}
