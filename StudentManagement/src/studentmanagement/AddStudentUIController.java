/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class AddStudentUIController implements Initializable {

    @FXML
    private TextField studentName;
    @FXML
    private TextField email;
    @FXML
    private TextField stream;
    @FXML
    private TextArea address;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    
    public static ObservableList <Student> studentList=FXCollections.observableArrayList() ;

    @FXML
    private void saveButton(ActionEvent event) throws IOException {
        if(studentName.getText().equals("")||email.getText().equals("")||stream.getText().equals("")||address.getText().equals("")) return ;
        //studentList.add(new Student(studentName.getText(), email.getText(), stream.getText(), address.getText()));
        //file operation
        File file=new File("data.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write(studentName.getText()+"#"+email.getText()+"#"+stream.getText()+"#"+address.getText()+"\r\n");

        fileWriter.close();
        //FOR CLEAN ALL FIELD
        studentName.setText("");
        email.setText("");
        stream.setText("");
        address.setText("");
        
    }

    @FXML
    private void resetButton(ActionEvent event) {
        studentName.setText("");
        email.setText("");
        stream.setText("");
        address.setText("");
    }
    
}
