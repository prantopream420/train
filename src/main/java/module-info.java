module com.example.train {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.train to javafx.fxml;
    exports com.example.train;
}