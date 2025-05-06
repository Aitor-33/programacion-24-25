module org.example.clasesparking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.clasesparking to javafx.fxml;
    exports org.example.clasesparking;
}