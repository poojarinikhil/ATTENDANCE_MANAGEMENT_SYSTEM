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
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class New_registrationController {
    @FXML
    protected Button SUBMIT_BUTTON,registered;
    @FXML
    private TextField username_tf;

    @FXML
    private TextField password_tf;

    @FXML
    private TextField name_tf;

    @FXML
    private Label message;

    @FXML
    protected void SubmitOnAction(ActionEvent event) {
        try {
            validateLogin();
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
    protected void registerOnAction(ActionEvent event){
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

        public void validateLogin () {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            String verifyLogin = "SELECT count(1) FROM username WHERE username = '"+ username_tf.getText() + "' AND password = '" + password_tf.getText()+"'";
            String insertlogin = "INSERT INTO username values ('" + username_tf.getText() + "','" + name_tf.getText() + "','" + password_tf.getText() + "');";
            try {
                Statement statement = connectDB.createStatement();

                ResultSet queryResult = statement.executeQuery(verifyLogin);

                while (queryResult.next()) {
                    if (queryResult.getInt(1) == 1) {
                        message.setText("account exist");
                    } else {
                        PreparedStatement create = connectDB.prepareStatement("INSERT INTO username values ('" + username_tf.getText() + "','" + name_tf.getText() +"','" + password_tf.getText() +"');");
                        create.executeUpdate();
                        message.setText("Account registered");
                    }
                }
                connectDB.close();
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }

        public void createAccountForm () {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("New_registration.fxml"));
                Stage registration_stage = new Stage();
                registration_stage.initStyle(StageStyle.UNDECORATED);
                registration_stage.setScene(new Scene(root, 394.0, 613.0));
                registration_stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }
    }
