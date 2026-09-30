package com.ex0101;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller1 {

    @FXML
    private Label lbl;

    @FXML
    private Button turnbtn;
    
    @FXML 
    private void turnback() {
        UtilsViews.setView("View0");
    }

    @FXML  void updateLabels() {
        lbl.setText("Hola, " + Main.name + ", tens " + Main.age + " anys!");
    }
}
