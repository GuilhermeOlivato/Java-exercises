package com.division;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label divisao;
    @FXML
    private Label resto;
    @FXML
    private Button dividirBotao;
    @FXML
    private TextField valor1;
    @FXML
    private TextField valor2;
    @FXML
    private AnchorPane fundo;

    @FXML
    protected void clicouBotao() {
        int n1 = Integer.parseInt(valor1.getText());
        int n2 = Integer.parseInt(valor2.getText());
        float div = ((float)n1/n2);
        float res = n1%n2;

        divisao.setText(String.format("%.2f", div));
        resto.setText(String.format("%.2f", res));

    }
}