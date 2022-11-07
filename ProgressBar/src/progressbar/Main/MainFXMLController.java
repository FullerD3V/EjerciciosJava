/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {

    @FXML
    private ProgressBar barProgress;
    
    @FXML
    private Label lblProgress;
    
    double i = 0;
    
    @FXML
    private void barProgressOnClick(MouseEvent event){
        i = 0.1 + i;
        barProgress.setProgress(i);
        if(barProgress.getProgress() >= 1){
            lblProgress.setText("Completado");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
