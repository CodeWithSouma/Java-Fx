/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import jdk.jfr.events.FileWriteEvent;

/**
 * FXML Controller class
 *
 * @author souma
 */
public class ShowAllStudentUIController implements Initializable {

    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> stream;
    @FXML
    private TableColumn<Student, String> email;
    @FXML
    private TableColumn<Student, String> address;
    @FXML
    private TableView<Student> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AddStudentUIController.studentList.clear();
        try {
            File file=new File("data.txt");
            if(!file.exists()) file.createNewFile();
            Scanner fileReader=new Scanner(file);
            while(fileReader.hasNext()){
                
                String parts[]=fileReader.nextLine().split("#");
                AddStudentUIController.studentList.add(new Student(parts[0], parts[1], parts[2], parts[3]));
                
            }
            
           
            
            name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
            stream.setCellValueFactory(new PropertyValueFactory<Student, String>("stream"));
            email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
            address.setCellValueFactory(new PropertyValueFactory<Student, String>("address"));

            tableView.setItems(AddStudentUIController.studentList);

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }
    
    ObservableList<Student>selectedStudentList=FXCollections.observableArrayList();

    @FXML
    private void deleteButtonAction(ActionEvent event) throws IOException {
        
        if(tableView.getSelectionModel().getSelectedItems().isEmpty()) return;
        
        selectedStudentList=tableView.getSelectionModel().getSelectedItems();//it returns a student types arraylist
        AddStudentUIController.studentList.removeAll(selectedStudentList);
        
        File file=new File("data.txt");
        FileWriter fileWriter=new FileWriter(file);
        for (Student student : AddStudentUIController.studentList) {
          fileWriter.write(student.getName()+"#"+student.getEmail()+"#"+student.getStream()+"#"+student.getAddress()+"\r\n");
            
        }
        fileWriter.close();
    }

}
