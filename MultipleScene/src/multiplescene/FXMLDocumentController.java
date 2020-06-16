/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescene;

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
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author souma
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private BorderPane borderPane;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Parent sceneOne = null;
        try {
            sceneOne = FXMLLoader.load(getClass().getResource("SceneOne.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderPane.setCenter(sceneOne);
    }    

    @FXML
    private void firstButtonAction(ActionEvent event) throws IOException {
        Parent sceneOne=FXMLLoader.load(getClass().getResource("SceneOne.fxml"));
        borderPane.setCenter(sceneOne);
    }

    @FXML
    private void secondButtonAction(ActionEvent event) throws IOException {
        Parent sceneTwo=FXMLLoader.load(getClass().getResource("SceneTwo.fxml"));
        borderPane.setCenter(sceneTwo);
    }

   
}
