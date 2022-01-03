package com.example.attendance_management_system;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class STUDENT_VIEW_20_21_CONTROLLER implements Initializable {
    @FXML
    private TableColumn<STUDENTS_20_21,Integer> ROLLNOCOL;
    @FXML
    private TableColumn<STUDENTS_20_21,String> FULLNAMECOL;
    @FXML
    private TableColumn<STUDENTS_20_21, Button> PRESENTCOL;
    @FXML
    private TableColumn<STUDENTS_20_21, Button> ABSENTCOL;
    @FXML
    public TableView attendance_table;
    ObservableList<STUDENTS_20_21> studlist = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resource) {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        String StudentQuery = "select roll_no, fullname,lecs from student_20_21";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryoutput = statement.executeQuery(StudentQuery);
            while (queryoutput.next()) {
                Integer queryroll_no = queryoutput.getInt("roll_no");
                String queryfullname = queryoutput.getString("fullname");
                Integer querylecs = queryoutput.getInt("lecs");
                studlist.add(new STUDENTS_20_21(queryroll_no, queryfullname));
            }
            ROLLNOCOL.setCellValueFactory(new PropertyValueFactory<>("rollnoProperty"));
            FULLNAMECOL.setCellValueFactory(new PropertyValueFactory<>("fullnameProperty"));
            PRESENTCOL.setCellValueFactory(new PropertyValueFactory<>("present"));
            ABSENTCOL.setCellValueFactory(new PropertyValueFactory<>("absent"));
            attendance_table.setItems(studlist);
        } catch (SQLException e) {
            Logger.getLogger(add_subject.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }
//        private void initTable(){
//            initCols();
//        }
//        private void initCols(){
//            ROLLNOCOL.setCellValueFactory(new PropertyValueFactory<>("rollnoProperty"));
//            FULLNAMECOL.setCellValueFactory(new PropertyValueFactory<>("fullnameProperty"));
//            PRESENTCOL.setCellValueFactory(new PropertyValueFactory<>("present"));
//            ABSENTCOL.setCellValueFactory(new PropertyValueFactory<>("absent"));
//        }
//    }

    public void go_home(ActionEvent event) {
        try {
            add_subject add_subject = new add_subject();
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

    public void GOBACKLECS(ActionEvent event) {
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

    public void attendance_percentage(ActionEvent event) {
        try {
            add_subject add_subject = new add_subject();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("percentage_20_21.fxml"));
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
