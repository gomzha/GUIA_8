module com.example.encontrarerror {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.encontrarerror to javafx.fxml;
    exports com.example.encontrarerror;
}