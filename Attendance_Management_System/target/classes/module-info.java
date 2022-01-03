module com.example.attendance_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires mysql.connector.java;
    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.example.attendance_management_system to javafx.fxml;
    opens com.example.attendance_management_system to javafx.graphics;
    exports com.example.attendance_management_system;
}