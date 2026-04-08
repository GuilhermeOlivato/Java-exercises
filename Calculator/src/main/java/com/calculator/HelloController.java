package com.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label lblNumber;
    @FXML
    private Button btEqual;
    @FXML
    private Button btNmb0;
    @FXML
    private Button btNmb1;
    @FXML
    private Button btNmb2;
    @FXML
    private Button btNmb3;
    @FXML
    private Button btNmb4;
    @FXML
    private Button btNmb5;
    @FXML
    private Button btNmb6;
    @FXML
    private Button btNmb7;
    @FXML
    private Button btNmb8;
    @FXML
    private Button btNmb9;
    @FXML
    private Button btDiv;
    @FXML
    private Button btPlus;
    @FXML
    private Button btMinus;
    @FXML
    private Button btTimes;



    @FXML
    protected void clicouBotao() {
        lblNumber.setText("Welcome to JavaFX Application!");
    }

    public void main(String[] args){
        int num1 = 0;
        int num2 = 0;


    }
}