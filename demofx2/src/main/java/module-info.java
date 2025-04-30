module org.example.demofx2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demofx2 to javafx.fxml;
    exports org.example.demofx2;
}