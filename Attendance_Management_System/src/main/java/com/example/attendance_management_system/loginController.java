package com.example.attendance_management_system;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import java.lang.String;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
public class loginController{

    @FXML
    private Button HOME;

    @FXML
    public Button add_batches_20_21,add_batches_19_20,add_batches_18_19,add_batches_17_18,other_batches;



    @FXML
    protected Button go_back;

    @FXML
    protected void batches_20_21OnAction(ActionEvent event){
        try {
            validateLogin_20_21();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_20_21.fxml"));
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
    @FXML
    protected void batches_19_20OnAction(ActionEvent event){
        try {
            validateLogin_19_20();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_19_20.fxml"));
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
    protected void batches_18_19OnAction(ActionEvent event){
        try {
            validateLogin_18_19();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_18_19.fxml"));
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
    protected void batches_17_18OnAction(ActionEvent event){
        try {
            validateLogin_17_18();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_no_17_18.fxml"));
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
    protected void batches_other_batchesOnAction(ActionEvent event){
        try {
            validateLogin_other_batches();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_other_batches.fxml"));
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
    protected void gobackuAction(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FIRST_PAGE.fxml"));
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void validateLogin_17_18 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {

            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS batch_17_18 (subject_1 varchar(30), subject_2 varchar(30), subject_3 varchar(30),subject_4 varchar(30) ,subject_5 varchar(30));");
            create.executeUpdate();

            connectDB.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void validateLogin_20_21 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {

            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS batch_20_21 (subject_1 varchar(30), subject_2 varchar(30), subject_3 varchar(30), subject_4 varchar(30), subject_5 varchar(30))");
            create.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void validateLogin_18_19 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {

            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS batch_18_19 (subject_1 varchar(30), subject_2 varchar(30), subject_3 varchar(30),subject_4 varchar(30) ,subject_5 varchar(30));");
            create.executeUpdate();

            connectDB.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void validateLogin_19_20 () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {

            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS batch_19_20 (subject_1 varchar(30), subject_2 varchar(30), subject_3 varchar(30),subject_4 varchar(30) ,subject_5 varchar(30));");
            create.executeUpdate();

            connectDB.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void validateLogin_other_batches () {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {

            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS other_batch(subject_1 varchar(30), subject_2 varchar(30), subject_3 varchar(30),subject_4 varchar(30) ,subject_5 varchar(30));");
            create.executeUpdate();

            connectDB.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

