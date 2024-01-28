package com.controllers;

import com.models.Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController {

    private Calculator calculator;

    @FXML
    private Button ButtonChangeValue;

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonComma;

    @FXML
    private Button buttonDivide;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonResult;

    @FXML
    private Button buttonTimes;

    @FXML
    private TextField textfieldResults;

    private void updateTextField() {
        textfieldResults.setText(String.valueOf(calculator.getValue()));
    }

    private int getTextFieldValue() {
        return Integer.parseInt(textfieldResults.getText());
    }

    @FXML
    void handleButton0Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 0);
        updateTextField();
    }

    @FXML
    void handleButton1Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 1);
        updateTextField();
    }

    @FXML
    void handleButton2Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 2);
        updateTextField();
    }

    @FXML
    void handleButton3Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 3);
        updateTextField();
    }

    @FXML
    void handleButton4Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 4);
        updateTextField();
    }

    @FXML
    void handleButton5Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 5);
        updateTextField();
    }

    @FXML
    void handleButton6Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 6);
        updateTextField();
    }

    @FXML
    void handleButton7Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 7);
        updateTextField();
    }

    @FXML
    void handleButton8Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 8);
        updateTextField();
    }
    @FXML
    void handleButton9Action(ActionEvent event) {
        updateTextField();
        calculator.concatenateNumbers(getTextFieldValue(), 9);
        updateTextField();
    }

    @FXML
    void handleButtonAddAction(ActionEvent event) {
        updateTextField();
        calculator.add(getTextFieldValue());
    }

    @FXML
    void handleButtonChangeValueAction(ActionEvent event) {

    }

    @FXML
    void handleButtonCommaAction(ActionEvent event) {

    }

    @FXML
    void handleButtonDivideAction(ActionEvent event) {

    }

    @FXML
    void handleButtonMinusAction(ActionEvent event) {

    }

    @FXML
    void handleButtonResultAction(ActionEvent event) {

    }

    @FXML
    void handleButtonTimesAction(ActionEvent event) {

    }

    public void setMainViewController(Calculator calculator) {
        this.calculator = calculator;
    }

}
