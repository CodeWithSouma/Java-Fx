/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author souma
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<String> listView;

    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    private TextField textField;
    @FXML
    private Label label;

    String selectedItem;
    File file = new File("data.txt");
    
    
    Scanner scanner;

    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        if (!file.exists()){
            
            try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        list.add("Apple");
        list.add("Banana");
        list.add("Pinapple");
        list.add("Orange");
        list.add("Lichi");
        
        
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

         for (String string : list) {
            try {
                fileWriter.write(string+"\n");
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
        
        listView.setItems(list);
        list.clear();
        try {
            scanner=new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(scanner.hasNext()){
           list.add( scanner.next());
        }

    }

    

    ObservableList<String> selectedItems = FXCollections.observableArrayList();

    @FXML
    private void listView(MouseEvent event) throws IOException {
        selectedItem = listView.getSelectionModel().getSelectedItem();

        selectedItems = listView.getSelectionModel().getSelectedItems();
        String select = "";

        for (String selectedItem : selectedItems) {

            select += selectedItem + "\n";
        }
        label.setText("Selected Items\n" + select);

        

    }

    @FXML
    private void deleteButtonAction(ActionEvent event) throws IOException {
        //list.remove(selectedItem);

        list.removeAll(selectedItems);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);

         for (String string : list) {
            fileWriter.write(string+"\n");

        }
        fileWriter.close();

    }

    @FXML
    private void addButtonAction(ActionEvent event) throws IOException {
        
        if (!textField.getText().equals("")) {
            list.add(textField.getText());
        }
        
        // listView.setItems(list);
        
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        for (String string : list) {
            fileWriter.write(string+"\n");

        }
        fileWriter.close();
    }

}
