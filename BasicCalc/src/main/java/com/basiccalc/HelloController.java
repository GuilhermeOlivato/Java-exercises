package com.basiccalc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label resultadoSoma;

    @FXML
    private Button btnSoma;
    @FXML
    private AnchorPane fundo;
    @FXML
    private TextField valor1;
    @FXML
    private TextField valor2;

    @FXML
    protected void clicouBotao() {
        int n1 = Integer.parseInt(valor1.getText());
        int n2 = Integer.parseInt(valor2.getText());
        int s = n1 + n2;
        resultadoSoma.setText(Integer.toString(s));
    }
}