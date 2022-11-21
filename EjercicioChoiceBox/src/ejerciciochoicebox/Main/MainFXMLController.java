/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciochoicebox.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private ChoiceBox chbox;
    
    @FXML
    private Button btn;
    
    @FXML
    private Label lbl;
    
    private String opt;
    
    @FXML
    private void btnOnAction(){
        opt = chbox.getValue().toString();
        switch(opt){
            case "Opción 1":
                lbl.setText("Se ha seleccionado la primera opción");
                break;
            case "Opción 2":
                lbl.setText("Se ha elegido la segunda opción");
                break;
            default:
                lbl.setText("Ninguna opción ha sido elegida");
                break;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chbox.setValue("Elegir una opción");
        chbox.getItems().add("Elegir una opción");
        chbox.getItems().add("Opción 1");
        chbox.getItems().add("Opción 2");
    }    
    
}
