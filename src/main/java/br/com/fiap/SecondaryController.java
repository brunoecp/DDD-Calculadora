package br.com.fiap;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML   TextField textFieldTela;
    int resultado;
    int igual;

    public void num1() {
        textFieldTela.setText(textFieldTela.getText() + "1");
    }
    public void num2() {
        textFieldTela.setText(textFieldTela.getText() + "2");
    }
    public void num3() {
        textFieldTela.setText(textFieldTela.getText() + "3");
    }
    public void num4() {
        textFieldTela.setText(textFieldTela.getText() + "4");
    }
    public void num5() {
        textFieldTela.setText(textFieldTela.getText() + "5");
    }
    public void num6() {
        textFieldTela.setText(textFieldTela.getText() + "6");
    }
    public void num7() {
        textFieldTela.setText(textFieldTela.getText() + "7");
    }
    public void num8() {
        textFieldTela.setText(textFieldTela.getText() + "8");
    }
    public void num9() {
        textFieldTela.setText(textFieldTela.getText() + "9");
    }
    public void num0() {
        textFieldTela.setText(textFieldTela.getText() + "0");
    }
    public void somar() {
        resultado = Integer.valueOf(textFieldTela.getText());
        textFieldTela.setText("");   
    }
    public void igual() {
        igual = resultado + Integer.valueOf(textFieldTela.getText());
        textFieldTela.setText(String.valueOf(igual));
    }
    // public void somar() {
    //     label.set("")
    //     resultado += Integer.valueOf(label.getText());

    // }
}