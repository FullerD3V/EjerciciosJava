/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt.Ex3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class FXMLController implements Initializable {
    
    @FXML
    private Button btn;
    
    @FXML
    private TableView tbl;
    
    @FXML
    private TableColumn col1, col2, col3;
    
    @FXML
    public void btnOnAction(ActionEvent event){}

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
