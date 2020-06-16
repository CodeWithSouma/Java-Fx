/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author souma
 */
public class MainUIController implements Initializable {
    
    

    Parent UI = null;
    @FXML
    private VBox mainContent;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
        
    }    

    @FXML
    private void addStudent(ActionEvent event) throws IOException {
               
        UI=FXMLLoader.load(getClass().getResource("AddStudentUI.fxml"));
        mainContent.getChildren().setAll(UI);
        
    }

    @FXML
    private void showAll(ActionEvent event) throws IOException {
       
        UI=FXMLLoader.load(getClass().getResource("ShowAllStudentUI.fxml"));
        mainContent.getChildren().setAll(UI);
        
    }
    
}
