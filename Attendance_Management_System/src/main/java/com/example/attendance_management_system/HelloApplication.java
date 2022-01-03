package com.example.attendance_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FIRST_PAGE.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("ATTENDANCE MANAGEMENT SYSTEM");
//        stage.setScene(scene);
//        stage.show();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FIRST_PAGE.fxml"));
        Parent root1 = fxmlLoader.load();
        primarystage.setScene(new Scene(root1));
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}