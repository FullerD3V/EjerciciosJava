/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.AccessibleAttribute;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    @FXML
    private Label lbl;
    
    @FXML
    private TextField txtNombre;
    
    @FXML
    private Slider sliderSize;
    
    @FXML
    private ColorPicker color;
    
    @FXML
    private DatePicker fecha;
    
    @FXML
    private void txtNombreOnKeyReleased(){
        cambiarLabel();
    }
    
    @FXML
    private void fechaOnAction(){
        cambiarLabel();
    }
        
    @FXML
    private void sliderSizeOnDragDetected(){
        lbl.setStyle("font-size {}");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void cambiarLabel(){
        lbl.setText(txtNombre.getText() + " " + fecha.getValue());
    }
}
