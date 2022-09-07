module com.example.clickswitchbutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clickswitchbutton to javafx.fxml;
    exports com.example.clickswitchbutton;
}