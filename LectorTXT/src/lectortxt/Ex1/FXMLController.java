/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt.Ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class FXMLController implements Initializable {
    
    @FXML
    private Button btn;
    
    @FXML
    private ListView lst;
    
    @FXML
    public void btnOnAction(ActionEvent event) throws FileNotFoundException, IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("/home/alumno/NetBeansProjects/LectorTXT/README.md"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();  
                if(line != null){
                    lst.getItems().add(line);
                }
            }
        } finally {
            br.close();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
