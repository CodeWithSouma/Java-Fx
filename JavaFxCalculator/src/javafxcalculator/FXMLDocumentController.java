/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author souma
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField numberOneField;
    @FXML
    private TextField numberTwoField;
    @FXML
    private Button addButton;
    @FXML
    private Label resultLabel;
    @FXML
    private Button substructButton;
    @FXML
    private Button multiplyButton;
    @FXML
    private Button divideButton;
    
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        try{
        if(event.getSource()==addButton){
             
          
           resultLabel.setText(Double.toString(Double.parseDouble(numberOneField.getText())+Double.parseDouble(numberTwoField.getText())));
    
       
         }
        else if(event.getSource()==substructButton){
             resultLabel.setText(Double.toString(Double.parseDouble(numberOneField.getText())-Double.parseDouble(numberTwoField.getText())));
    
        }
        else if(event.getSource()==multiplyButton){
             resultLabel.setText(Double.toString(Double.parseDouble(numberOneField.getText())*Double.parseDouble(numberTwoField.getText())));
    
        }
        else if(event.getSource()==divideButton){
             resultLabel.setText(Double.toString(Double.parseDouble(numberOneField.getText())/Double.parseDouble(numberTwoField.getText())));
    
        }
        
        }catch(Exception e){
          resultLabel.setText("Invalid Input...please enter two integer.");
       }
    }
    
    
       
   
    
}
