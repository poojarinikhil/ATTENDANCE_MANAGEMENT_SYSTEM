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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class add_subject {
    public int i = 0;
    @FXML
    public Button LEC_1, LEC_2, LEC_3, LEC_4, PRAC_1, PRAC_2, PRAC_3, PRAC_4;
    @FXML
    public Button add_subject, subject_1, subject_2, subject_3, subject_4, subject_5, subject_6;
    public Button[] subject_;
    public TextField rollno_ATTENDANCE_PERCANTAGE_tf;
    public Button CALCULATE;
    public TextField SHOW_ATTENDANCE;
    @FXML
    private TextField subject_name_tf;




//    add_subject() throws Exception {
//        set_subject_name_subject_1(subject_1);
//    }
//    public void add_subject_first_page_on_action(ActionEvent event){
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } catch (Exception ep) {
//            ep.printStackTrace();
//        }
//    }

    public void subject_name() {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create_table = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS subject_20_21 (subject_name varchar(30) not null ,subject_no int not null primary key auto_increment )");
            create_table.executeUpdate();
            PreparedStatement create = connectDB.prepareStatement("INSERT INTO subject_20_21 (subject_name) VALUE ('" + subject_name_tf.getText() + "')");
            create.executeUpdate();
//        set_subject_name_subject_1(subject_1);
            connectDB.close();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void go_home(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void go_back_batches(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void add_subject_button(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SUBJECTS_20_21"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    @FXML
    public void set_subject_name_subject_1() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 1");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_1.setText(a);
                subject_1.setVisible(true);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void set_subject_name_subject_2() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 2");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_2.setVisible(true);
                subject_2.setText(a);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void set_subject_name_subject_3() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 3");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_3.setVisible(true);
                subject_3.setText(a);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void set_subject_name_subject_4() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 4");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_4.setVisible(true);
                subject_4.setText(a);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void set_subject_name_subject_5() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 5");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_5.setVisible(true);
                subject_5.setText(a);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void set_subject_name_subject_6() throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("SELECT subject_name FROM subject_20_21 WHERE subject_no = 6");
            ResultSet newresult = posted.executeQuery();
            while (newresult.next()) {
                String a = newresult.getString("subject_name");
                subject_6.setVisible(true);
                subject_6.setText(a);
            }
//            String a = newresult.getString("subject_name");
//            button.setText(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void Support(ActionEvent Event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("support.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 206);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void assign_subject_name(ActionEvent event) throws Exception {
        set_subject_name_subject_1();
        set_subject_name_subject_2();
        set_subject_name_subject_3();
        set_subject_name_subject_4();
        set_subject_name_subject_5();
        set_subject_name_subject_6();
    }

    @FXML
    public void delete_all_subjects(ActionEvent event) throws Exception {
        try {
            DATABASECONNECTION connectNow = new DATABASECONNECTION();
            Connection connectDB = connectNow.getConnection();
            PreparedStatement posted = connectDB.prepareStatement("TRUNCATE subject_20_21 ");
            posted.executeUpdate();
            subject_1.setVisible(false);
            subject_2.setVisible(false);
            subject_3.setVisible(false);
            subject_4.setVisible(false);
            subject_5.setVisible(false);
            subject_6.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // -------------------------------------------------------------------------------- ADDING LECTURES -----------------------------------------------------------------------------------------------------------------------------------------------------------
    public void gobackuAction_MARK_ATTENDANCE(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SUBJECTS_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void ADD_LEC_LEC_1_20_21_subject1() {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS SUBJECT1_no_of_lecs_20_21 (dates date not null primary key, LECS int , PRACS int)");
            create.executeUpdate();
            try {
                PreparedStatement add = connectDB.prepareStatement("INSERT INTO SUBJECT1_no_of_lecs_20_21 (dates,LECS,PRACS) VALUE(curdate(),1,0)");
                add.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void ADD_MORE_LEC_20_21_subject1(ActionEvent event) {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement update = connectDB.prepareStatement("UPDATE SUBJECT1_no_of_lecs_20_21 set LECS = LECS+1 where dates = curdate() AND LECS<4; ");
            update.executeUpdate();
            PreparedStatement getlecno = connectDB.prepareStatement("SELECT LECS FROM SUBJECT1_no_of_lecs_20_21");
            ResultSet NEWS = getlecno.executeQuery();
            while (NEWS.next()) {
                int b = NEWS.getInt("LECS");
                System.out.println(b);
                switch (b) {
                    case 2: {
                        LEC_2.setVisible(true);
                        break;
                    }
                    case 3: {
                        LEC_2.setVisible(true);
                        LEC_3.setVisible(true);
                        break;
                    }
                    case 4: {
                        LEC_2.setVisible(true);
                        LEC_3.setVisible(true);
                        LEC_4.setVisible(true);
                        break;
                    }

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    public void ADD_LEC_PRAC_1_20_21_subject1(ActionEvent event){
//        DATABASECONNECTION connectNow = new DATABASECONNECTION();
//        Connection connectDB = connectNow.getConnection();
//        try {
//            PreparedStatement create = connectDB.prepareStatement("CREATE TABLE IF NOT EXISTS SUBJECT1_no_of_lecs_20_21 (dates date not null primary key, LECS int , PRACS int)");
//            create.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//    }
    public void ADD_LEC_LEC_4_20_21_subject1(ActionEvent event) {

    }

    public void ADD_MORE_PRAC_20_21_subject1(ActionEvent event) {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            PreparedStatement update = connectDB.prepareStatement("UPDATE SUBJECT1_no_of_lecs_20_21 set PRACS =1 where dates = curdate() AND PRACS=0;");
            update.executeUpdate();
            PreparedStatement real_update = connectDB.prepareStatement("UPDATE SUBJECT1_no_of_lecs_20_21 set PRACS =PRACS+1 where dates = curdate() AND PRACS<5;");
            real_update.executeUpdate();

            PreparedStatement getpracno = connectDB.prepareStatement("SELECT PRACS FROM SUBJECT1_no_of_lecs_20_21");
            ResultSet NEWSs = getpracno.executeQuery();
            while (NEWSs.next()) {
                int c = NEWSs.getInt("PRACS");
                System.out.println(c);
                switch (c) {
                    case 2: {
                        PRAC_1.setVisible(true);
                        break;
                    }
                    case 3: {
                        PRAC_1.setVisible(true);
                        PRAC_2.setVisible(true);
                        break;
                    }
                    case 4: {
                        PRAC_1.setVisible(true);
                        PRAC_2.setVisible(true);
                        PRAC_3.setVisible(true);
                        break;
                    }
                    case 5: {
                        PRAC_1.setVisible(true);
                        PRAC_2.setVisible(true);
                        PRAC_3.setVisible(true);
                        PRAC_4.setVisible(true);
                        break;
                    }

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void subject_1_pressed(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mark_attendance_20_21_subject_1.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    public void lec1_20_21(ActionEvent event) {
        try {
            ADD_LEC_LEC_1_20_21_subject1();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LEC_1_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void lec2_20_21(ActionEvent event) {
        try {
            ADD_LEC_LEC_1_20_21_subject1();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LEC_1_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void lec3_20_21(ActionEvent event) {
        try {
            ADD_LEC_LEC_1_20_21_subject1();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LEC_1_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }
    public void lec4_20_21(ActionEvent event) {
        try {
            ADD_LEC_LEC_1_20_21_subject1();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LEC_1_20_21.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }

    


//----------------------------------------------------------------------------------------------------- MARK ATTENDANCE --------------------------------------------------------------------------------------------------------------------
//    @FXML
//    private TableColumn<STUDENTS_20_21,Integer> ROLLNOCOL;
//    @FXML
//    private TableColumn<STUDENTS_20_21,String> FULLNAMECOL;
//    @FXML
//    private TableColumn<STUDENTS_20_21, java.awt.Button> PRESENTCOL;
//    @FXML
//    private TableColumn<STUDENTS_20_21, java.awt.Button> ABSENTCOL;
//    @FXML
//    public TableView attendance_table;

//    public static ObservableList<STUDENTS_20_21> getAllRecord() throws ClassNotFoundException,SQLException{
//        DATABASECONNECTION connectNow = new DATABASECONNECTION();
//        Connection connectDB = connectNow.getConnection();
//        try {
//            PreparedStatement getpracno = connectDB.prepareStatement("SELECT roll_no,fullname from student_20_21");
//            ResultSet RS = getpracno.executeQuery();
//            ObservableList<STUDENTS_20_21> studlist = getSTUDENTS_20_21Objects(RS);
//            return studlist;
//        }catch (Exception e){
//            System.out.println(e);
//            throw e;
//        }
//    }
//    @FXML
//    private static ObservableList<STUDENTS_20_21> getSTUDENTS_20_21Objects(ResultSet rs) throws ClassNotFoundException,SQLException{
//       try {
//           ObservableList<STUDENTS_20_21> studlist = FXCollections.observableArrayList();
//           while (rs.next()){
//               STUDENTS_20_21 STUD = new STUDENTS_20_21();
//               STUD.setRollno(rs.getInt("roll_no"));
//               STUD.setFullname(rs.getString("fullname"));
//               studlist.add(STUD);
//           }
//           return studlist;
//       }catch (SQLException e){
//           System.out.println(e);
//           throw e;
//       }
//    }
//ObservableList<STUDENTS_20_21> studlist = FXCollections.observableArrayList();
//    @Override
//    public void initialize(URL url, ResourceBundle resource){
//        DATABASECONNECTION connectNow = new DATABASECONNECTION();
//        Connection connectDB = connectNow.getConnection();
//        String StudentQuery = "select roll_no, fullname from student_20_21";
//        try {
//                Statement statement = connectDB.createStatement();
//                ResultSet queryoutput = statement.executeQuery(StudentQuery);
//                while (queryoutput.next()){
//                    Integer queryroll_no = queryoutput.getInt("roll_no");
//                    String queryfullname = queryoutput.getString("fullname");
//
//                    studlist.add(new STUDENTS_20_21(queryroll_no,queryfullname));
//                }
//                ROLLNOCOL.setCellValueFactory(new PropertyValueFactory<>("roll_no"));
//                FULLNAMECOL.setCellValueFactory(new PropertyValueFactory<>("fullname"));
//                attendance_table.setItems(studlist);
//        }catch (SQLException e){
//            Logger.getLogger(add_subject.class.getName()).log(Level.SEVERE,null,e);
//            e.printStackTrace();
//        }
//        ROLLNOCOL.setCellValueFactory(cellData -> cellData.getValue().getRollno().asObject());
//        FULLNAMECOL.setCellValueFactory(cellData -> cellData.getValue().getfullname());
//        ObservableList<STUDENTS_20_21> studlist = getAllRecord();
//        populateTable(studlist);




//    private void populateTable(ObservableList<STUDENTS_20_21> studlist) {
//        STUDENTS_20_21.setItems(studlist);
//    }

//-------------------------------------------------------------------------------------------         CALCULATE ATTENDANCE         ----------------------------------------------------------------------------------------------------------------
    public void gobackuACTION_LEC1(ActionEvent event) {
        try {
            ADD_LEC_LEC_1_20_21_subject1();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mark_attendance_20_21_subject_1.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception ep) {
            ep.printStackTrace();
        }
    }


    public void CALCULATE_ATTENDANCE(ActionEvent event) {
        DATABASECONNECTION connectNow = new DATABASECONNECTION();
        Connection connectDB = connectNow.getConnection();
        try {
            float attendance = 0;
            PreparedStatement update = connectDB.prepareStatement("SELECT lecs from student_20_21 where roll_no = " + rollno_ATTENDANCE_PERCANTAGE_tf.getText());
            ResultSet rsattendance = update.executeQuery();
            while (rsattendance.next()) {
                attendance = rsattendance.getFloat("lecs");
            }
            PreparedStatement get = connectDB.prepareStatement("select SUM(LECS) from subject1_no_of_lecs_20_21");
            ResultSet rsTotal = get.executeQuery();
            float Total=0 ;
            while (rsTotal.next()) {
                Total = rsTotal.getFloat("SUM(LECS)");
            }
            float percentage = (attendance / Total) * 100;
//            roll_no = Integer.parseInt(rollno_tf.getText()); String str1 = Integer.toString(a);
            String a = Float.toString(percentage);
            SHOW_ATTENDANCE.setText(a);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}