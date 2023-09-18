module com.example.arrayqueue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arrayqueue to javafx.fxml;
    exports com.example.arrayqueue;
}