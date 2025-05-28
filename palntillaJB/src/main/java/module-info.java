module org.example.palntillajb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens org.example.palntillajb to javafx.fxml;
    exports org.example.palntillajb;
    exports org.example.palntillajb.Utils;
    opens org.example.palntillajb.Utils to javafx.fxml;
    exports org.example.palntillajb.model;
    opens org.example.palntillajb.model to javafx.fxml;
}