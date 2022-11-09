/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paredor.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private Label lbl;
    
    @FXML
    private TextField txtNumeros, txtInput;
    
    @FXML
    private Button btnIzquierda, btnDerecha;
    
    int[] intArray;
    int j;
    int i;
    int posicion = 0;
    
    @FXML
    private void txtInputOnKeyReleased(KeyEvent event){
        intArray = new int[Integer.parseInt(txtInput.getText())];
        j = 1;
        i = 0;
        while (i < Integer.parseInt(txtInput.getText())) {
          if((j%2) == 0){
              intArray[i] = j;
              i++;
              j++;
          }else{
              j++;
          }
        }
        
        for(int n = 0; n < intArray.length; n++){
            System.out.println(intArray[n]);
        }
        
        txtNumeros.setText(String.valueOf(intArray[posicion]));
        btnIzquierda.setDisable(true);
    }
    
    @FXML
    private void btnIzquierdaOnAction(){        
        posicion--;
        txtNumeros.setText(String.valueOf(intArray[posicion]));
        comprobarPosicion();
    }
    
    @FXML
    private void btnDerechaOnAction(){
        posicion++;
        txtNumeros.setText(String.valueOf(intArray[posicion]));
        comprobarPosicion();
    }
    
    @FXML
    private void txtInputOnKeyTyped(KeyEvent event){
        if(!event.getCharacter().matches("[1-9]")){
           event.consume();
        }
    }
    
    private void comprobarPosicion(){
        if(posicion == intArray.length - 1){
            btnDerecha.setDisable(true);
        }else{
            btnDerecha.setDisable(false);
        }
        
        if(posicion == 0){
            btnIzquierda.setDisable(true);
        }else{
            btnIzquierda.setDisable(false);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
