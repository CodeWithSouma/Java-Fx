/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author souma
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> name;
    @FXML
    private TableColumn<Person, Integer> id;
    @FXML
    private TableColumn<Person, Float> salary;

    private ObservableList<Person> personRecords = FXCollections.observableArrayList(
            new Person("Soumadip Dey", 1, 4000),
            new Person("Soumik Nandi", 2, 4100),
            new Person("Sumit Synal", 3, 4300),
            new Person("Arijit Das", 4, 4500)
    );
    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField salaryField;
    @FXML
    private Label message;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        tableView.setItems(personRecords);
        name.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        id.setCellValueFactory(new PropertyValueFactory<Person, Integer>("ID"));
        salary.setCellValueFactory(new PropertyValueFactory<Person, Float>("salary"));
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
        try {
            if (!(nameField.getText().equals("") || idField.getText().equals("") || salaryField.getText().equals(""))) {
                personRecords.add(new Person(nameField.getText(), Integer.parseInt(idField.getText()), Float.parseFloat(salaryField.getText())));
                message.setText("The record was succesfully inserted.");
                message.setStyle("-fx-text-fill: green");
                nameField.setText("");
                idField.setText("");
                salaryField.setText("");

            } else {
                message.setText("You have to fill all data.");
                message.setStyle("-fx-text-fill: red");

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    ObservableList<Person> personList = FXCollections.observableArrayList();

    @FXML
    private void deleteButtonAction(ActionEvent event) {
        
        if (!(tableView.getSelectionModel().getSelectedItems().isEmpty())) {
            personList = tableView.getSelectionModel().getSelectedItems();
           

                personRecords.removeAll(personList);
            

            message.setText("Selected items are deleted succesfully.");
            message.setStyle("-fx-text-fill: green");

        }

        else{
             message.setText("");
        }
        
    }

}
