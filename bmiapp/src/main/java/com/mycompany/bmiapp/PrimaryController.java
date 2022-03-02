package com.mycompany.bmiapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML private TextField txtHeight;
    @FXML private TextField txtWeigh;
    @FXML private Label lb;
    
    public void bmiHandle(ActionEvent event){
        double height = Double.parseDouble(this.txtHeight.getText());
        double weigh = Double.parseDouble(this.txtWeigh.getText());
        double bmi = weigh / Math.pow(height,2);
        
        lb.setTextFill(Color.BLACK);
        
        if(bmi < 18.5)
            lb.setText("Gay");
        else if (bmi < 25 )
            lb.setText("Binh thuong");
        else
        {
            lb.setText("Beo phi");
            lb.setTextFill(Color.RED);
        }
    }
}
