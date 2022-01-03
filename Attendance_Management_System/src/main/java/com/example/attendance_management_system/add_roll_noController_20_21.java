package com.example.attendance_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.awt.*;
import java.sql.*;

public class add_roll_noController_20_21 {

    @FXML
    public TextField rollno_tf,fullname_tf;
    @FXML
    public Button add_batch,go_back;
    @FXML
    public Label MESSAGE;
    public Button mark_attendance_button_20_21;
    public Button add_rollno_button;
    public Button mark_attendance_button_17_18;
    public Button mark_attendance_button_19_20;
    public Button mark_attendance_button_18_19;

    @FXML
    public void validateLogin_20_21 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS student_20_21 (roll_no int primary key not null , fullname varchar(30),lecs int , pracs int)");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO student_20_21(roll_no, fullname,lecs,pracs) VALUES ("+rollno_tf.getText()+",'"+fullname_tf.getText()+"',0,0)");
            create.executeUpdate();

            connectDB.close();
        }catch (SQLIntegrityConstraintViolationException e){
            MESSAGE.setText("ROLL NO "+rollno_tf.getText()+" already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void validateLogin_19_20 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS student_19_20 (roll_no int primary key not null , fullname varchar(30) ,lecs int , pracs int)");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO student_19_20(roll_no, fullname,lecs,pracs) VALUES ("+rollno_tf.getText()+",'"+fullname_tf.getText()+"',0,0)");
            create.executeUpdate();

            connectDB.close();
        }catch (SQLIntegrityConstraintViolationException e){
            MESSAGE.setText("ROLL NO "+rollno_tf.getText()+" already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void validateLogin_18_19 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS student_18_19  (roll_no int primary key not null , fullname varchar(30),lecs int , pracs int) ");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO student_18_19 (roll_no, fullname,lecs,pracs) VALUES ("+rollno_tf.getText()+",'"+fullname_tf.getText()+"',0,0)");
            create.executeUpdate();

            connectDB.close();
        }catch (SQLIntegrityConstraintViolationException e){
            MESSAGE.setText("ROLL NO "+rollno_tf.getText()+" already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void validateLogin_17_18 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS student_17_18 (roll_no int primary key not null , fullname varchar(30),lecs int , pracs int )");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO student_17_18(roll_no, fullname,lecs,pracs) VALUES ("+rollno_tf.getText()+",'"+fullname_tf.getText()+"',0,0)");
            create.executeUpdate();

            connectDB.close();
        }catch (SQLIntegrityConstraintViolationException e){
            MESSAGE.setText("ROLL NO "+rollno_tf.getText()+" already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    public void validateLogin_other_batches () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS student_other_batches (roll_no int primary key not null , fullname varchar(30),lecs int , pracs int )");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO student_other_batches(roll_no, fullname,lecs,pracs) VALUES ("+rollno_tf.getText()+",'"+fullname_tf.getText()+"',0,0)");
            create.executeUpdate();

            connectDB.close();
        }catch (SQLIntegrityConstraintViolationException e){
            MESSAGE.setText("ROLL NO "+rollno_tf.getText()+" already exists");
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }
    @FXML
    protected void gobackuAction(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    int roll_no;

    public void ADD_ROLL_ON_ACTION_20_21(ActionEvent event) {

        try {
            validateLogin_20_21();
            roll_no = Integer.parseInt(rollno_tf.getText());
            MESSAGE.setText("student Entered");

        }catch (NumberFormatException e){
            MESSAGE.setText("please enter integer in rollno ");
        }
        catch (Exception e){
            MESSAGE.setText("error");
        }

    }
    public void ADD_ROLL_ON_ACTION_19_20(ActionEvent event) {

        try {
            validateLogin_19_20();
            roll_no = Integer.parseInt(rollno_tf.getText());
            MESSAGE.setText("student Entered");

        }catch (NumberFormatException e){
            MESSAGE.setText("please enter integer in rollno ");
        }
        catch (Exception e){
            MESSAGE.setText("error");
        }

    }
    public void ADD_ROLL_ON_ACTION_18_19(ActionEvent event) {

        try {
            validateLogin_18_19();
            roll_no = Integer.parseInt(rollno_tf.getText());
            MESSAGE.setText("student Entered");

        }catch (NumberFormatException e){
            MESSAGE.setText("please enter integer in rollno ");
        }
        catch (Exception e){
            MESSAGE.setText("error");
        }

    }
    public void ADD_ROLL_ON_ACTION_17_18(ActionEvent event) {

        try {
            validateLogin_17_18();
            roll_no = Integer.parseInt(rollno_tf.getText());
            MESSAGE.setText("student Entered");

        }catch (NumberFormatException e){
            MESSAGE.setText("please enter integer in rollno ");
        }
        catch (Exception e){
            MESSAGE.setText("error");
        }

    }
    public void ADD_ROLL_ON_ACTION_other_batches(ActionEvent event) {

        try {
            validateLogin_other_batches();
            roll_no = Integer.parseInt(rollno_tf.getText());
            MESSAGE.setText("student Entered");

        }catch (NumberFormatException e){
            MESSAGE.setText("please enter integer in rollno ");
        }
        catch (Exception e){
            MESSAGE.setText("error");
        }

    }
    public void ADD_STUDENT_ON_ACTION_20_21(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_roll_no_20_21.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void ADD_STUDENT_ON_ACTION_19_20(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_roll_no_19_20.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void ADD_STUDENT_ON_ACTION_18_19(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_roll_no_20_21.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    @FXML
    public void go_home(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void ADD_STUDENT_ON_ACTION_17_18(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_roll_no_20_21.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void ADD_STUDENT_ON_ACTION_other_batches(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add_roll_no_20_21.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void mark_attendance_button_subject_20_21(ActionEvent event){
        try {
            add_subject add_subject = new add_subject();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SUBJECTS_20_21.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
}
