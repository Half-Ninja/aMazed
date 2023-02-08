module com.example.amazed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.amazed to javafx.fxml;
    exports com.example.amazed;

}