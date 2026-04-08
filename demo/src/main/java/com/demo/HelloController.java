package com.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean freshInput = false; // true after operator is pressed

    @FXML
    private void handleNumber(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        String digit = clicked.getText();

        if (freshInput) {
            display.setText(digit); // start fresh after operator
            freshInput = false;
        } else {
            if (display.getText().equals("0")) {
                display.setText(digit);
            } else {
                display.setText(display.getText() + digit);
            }
        }
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        operator = clicked.getText();
        firstNumber = Double.parseDouble(display.getText());
        freshInput = true; // next number input starts clean
    }

    @FXML
    private void handleEquals(ActionEvent event) {
        if (operator.isEmpty()) return;

        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+": result = firstNumber + secondNumber; break;
            case "-": result = firstNumber - secondNumber; break;
            case "*": result = firstNumber * secondNumber; break;
            case "/":
                if (secondNumber == 0) {
                    display.setText("Error");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }

        // Show without decimal if result is a whole number
        if (result == (long) result) {
            display.setText(String.valueOf((long) result));
        } else {
            display.setText(String.valueOf(result));
        }

        operator = "";
    }

    @FXML
    private void handleClear(ActionEvent event) {
        display.setText("0");
        firstNumber = 0;
        operator = "";
        freshInput = false;
    }
}