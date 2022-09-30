package br.com.fiap;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField textFieldPNum;
    @FXML TextField textFieldSNum;
    @FXML Label labelResultado;

        private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private String user = "user";
        private String password = "senha";

        Double num1;
        Double num2;
        Double resultado;
        
    public void trocar() throws IOException{
        App.setRoot("secondary");
    }
    public void soma() {
        num1 = Double.valueOf(textFieldPNum.getText());
        num2 = Double.valueOf(textFieldSNum.getText());
        resultado = num1 + num2;
        labelResultado.setText(String.valueOf(resultado));
        conectar();
    }
    public void subtrair(){
        num1 = Double.valueOf(textFieldPNum.getText());
        num2 = Double.valueOf(textFieldSNum.getText());
        resultado = num1 - num2;
        labelResultado.setText(String.valueOf(resultado));
        conectar();
    }
    public void multiplicacao() {
        num1 = Double.valueOf(textFieldPNum.getText());
        num2 = Double.valueOf(textFieldSNum.getText());
        resultado = num1 * num2;
        labelResultado.setText(String.valueOf(resultado));
        conectar();
    }
    public void divisao() {
        num1 = Double.valueOf(textFieldPNum.getText());
        num2 = Double.valueOf(textFieldSNum.getText());
        resultado = num1 / num2;
        labelResultado.setText(String.valueOf(resultado));
        conectar(); 
    }
    public void quadrado() {
        num1 = Double.valueOf(textFieldPNum.getText());
        resultado = Math.pow(num1,2);
        labelResultado.setText(String.valueOf(resultado));
        conectar();
    }
    public void raiz() {
        num1 = Double.valueOf(textFieldPNum.getText());
        resultado = Math.sqrt(num1);
        labelResultado.setText(String.valueOf(resultado));
        conectar();
    }

    private void conectar() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO T_DDD_CALCULADORA(NUM1,NUM2,RESULTADO)" + "VALUES (?,?,?)";
            PreparedStatement stm= con.prepareStatement(sql);
            stm.setDouble(1, num1);
            stm.setDouble(2, num2);
            stm.setDouble(3, resultado);
            stm.execute();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        
    }
}
