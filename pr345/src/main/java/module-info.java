module com.example.pr345 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr345 to javafx.fxml;
    exports com.example.pr345;
}