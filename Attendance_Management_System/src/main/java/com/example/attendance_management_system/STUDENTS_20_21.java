package com.example.attendance_management_system;

//import com.mysql.cj.conf.IntegerProperty;
//import com.mysql.cj.conf.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class STUDENTS_20_21 {
    Integer rollnoProperty;
    String fullnameProperty;
    Button present;
    Button absent;

    public STUDENTS_20_21(Integer rollnoProperty,String fullnameProperty){
        this.rollnoProperty = rollnoProperty;
        this.fullnameProperty = fullnameProperty;
        this.present = new Button("PRESENT");
        present.setOnAction(this::handleButtononActionpresent);
        this.absent = new Button("ABSENT");
        absent.setOnAction(this::handleButtononActionabsent);
    }
    private void handleButtononActionpresent(ActionEvent event){
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement update = connectDB.prepareStatement("UPDATE STUDENT_20_21 set lecs = lecs+1 where roll_no = "+rollnoProperty);
            update.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        present.setStyle("-fx-background-color : #00FF00");
    }
    private void handleButtononActionabsent(ActionEvent event){
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement update = connectDB.prepareStatement("UPDATE STUDENT_20_21 set lecs = lecs-1 where roll_no = "+rollnoProperty+" AND lecs>0");
            update.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        present.setStyle("-fx-background-color : #FF0000");
    }


    public void setRollnoProperty(Integer rollnoProperty) {
        this.rollnoProperty = rollnoProperty;
    }

    public void setFullnameProperty(String fullnameProperty) {
        this.fullnameProperty = fullnameProperty;
    }

    public Integer getRollnoProperty() {
        return rollnoProperty;
    }

    public String getFullnameProperty() {
        return fullnameProperty;
    }

    public Button getPresent() {
        return present;
    }

    public Button getAbsent() {
        return absent;
    }
    public void setPresent(Button present) {
        this.present = present;
    }

    public void setAbsent(Button absent) {
        this.absent = absent;
    }

}
