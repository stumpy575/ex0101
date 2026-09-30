package com.ex0101;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller0 {

    @FXML
    private Button confirmbtn;
    @FXML
    private TextField agetxt, nametxt;

    private Integer age = null;
    private String name = "";

    @FXML
    private void confirm() {
        if (agetxt.getText().isEmpty()) {
            agetxt.setPromptText("Posa la teva edat");
            return;
        } else {
            Main.age = Integer.parseInt(agetxt.getText());

        }
        if (nametxt.getText().isEmpty()) {
            nametxt.setPromptText("Posa el teu nom");
            return;
        } else {
            Main.name = nametxt.getText();
        }
        Controller1 ctrl1 = (Controller1)UtilsViews.getController("View1");
        ctrl1.updateLabels();
        UtilsViews.setView("View1");
        
    }
}
