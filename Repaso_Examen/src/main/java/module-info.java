module org.example.repaso_examen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.repaso_examen to javafx.fxml;
    exports org.example.repaso_examen;
}