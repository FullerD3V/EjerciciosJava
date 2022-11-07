/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inactivebutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 *
 * @author alumno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtNombre;
    
    @FXML 
    private CheckBox check;
    
    @FXML
    private Button btn;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @FXML
    private void checkOnAction(){
        Comprobar();
    }
    
    @FXML
    private void txtNombreOnKeyTyped(){
        Comprobar();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void Comprobar(){
        if(!txtNombre.getText().isEmpty() && check.isSelected()){            
            btn.setDisable(false);
        }else{
            btn.setDisable(true);
        }
    }
    
}
