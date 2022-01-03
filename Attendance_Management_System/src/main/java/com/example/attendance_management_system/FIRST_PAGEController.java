package com.example.attendance_management_system;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FIRST_PAGEController  extends NullPointerException {
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;

    private Stage stage;
    private Scene scene;
    private Parent root;


    //    public  void initialize(URL url, ResourceBundle resourceBundle){
//        File brandingFile = new File("imagesfolder/newimages.jpg");
//        Image brandingImage = new Image(brandingFile.toURI().toString());
//        brandingImageView.setImage(brandingImage);
//    }
    @FXML
    protected Button login;
    @FXML
    protected Button signup_first_page_button;
    @FXML
    protected TextField username_first_page_tf;
    @FXML
    protected Button login_first_page_button;

    @FXML
    protected void signupOnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("New_registration.fxml"));
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
    protected void loginOnAction(ActionEvent event){
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
    private TextField username_login_tf;

    @FXML
    private PasswordField password_login_tf;

    @FXML
    private Label loginningmessage;

    @FXML
    private Button goback;
    @FXML
    public void validateLogin(ActionEvent event){
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT count(1) FROM username WHERE username = '"+username_login_tf.getText()+"' AND password = '"+password_login_tf.getText()+"'";
        try {
            PreparedStatement statement = connectDB.prepareStatement(verifyLogin);
            ResultSet queryResult = statement.executeQuery();
            while(queryResult.next()){
                if(queryResult.getInt(1)==1){
                    loginningmessage.setText("Congratulation!");
                    loginOnAction(event);
                }
                else{
                    loginningmessage.setText("Invalid login");
                }
            }
            connectDB.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
