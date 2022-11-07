/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt.Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class FXMLController implements Initializable {
    
    @FXML
    private Button btnGuardar;
    
    @FXML
    private TextField txt;
    
    @FXML
    public void btnGuardarOnAction(ActionEvent event) throws IOException{
        FileWriter myWriter = new FileWriter("/home/alumno/NetBeansProjects/LectorTXT/src/lectortxt/Ex2/Hola.txt", true);
        myWriter.write(txt.getText() + "\n" );
        myWriter.close();
    }
        

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
