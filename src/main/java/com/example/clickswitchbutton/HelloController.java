package com.example.clickswitchbutton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    int count = 0;
    @FXML
    private Label welcomeText;

    @FXML
    private Button btn;

    @FXML
    protected void onHelloButtonClick() {
        if (btn.getText().equals("Hello!")){
            btn.setText("I've been clicked!");
        } else {
            btn.setText("Hello!");
        }
        welcomeText.setText("The button has been clicked: " + (count++) + " times!");

    }
}