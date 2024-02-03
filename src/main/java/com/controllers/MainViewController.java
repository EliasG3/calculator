package com.controllers;

import com.models.ThreeInARow;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController {

    public ThreeInARow threeInARow;
    
    public void setMainViewController(ThreeInARow threeInARow) {
        this.threeInARow = threeInARow;
    }

}
