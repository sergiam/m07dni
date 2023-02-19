module com.example.m07dni {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.m07dni to javafx.fxml;
    exports com.example.m07dni;
}