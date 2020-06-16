
package check_box_demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class CheckBoxDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox=new HBox();
        hBox.setMinHeight(200);
        hBox.setMinWidth(300);
        
        VBox vBoxOne=new VBox();
        vBoxOne.setMinWidth(150);
        VBox vBoxTwo=new VBox();
        vBoxTwo.setMinWidth(150);
        
        
        Label labelOne=new Label("All fruits");
        labelOne.setFont(new Font("Arial",20));
        Label labelTwo=new Label("Selected fruits");
        labelTwo.setFont(new Font("Arial",20));
        
         vBoxOne.getChildren().add(labelOne);
        vBoxTwo.getChildren().add(labelTwo);
        
        vBoxOne.setStyle("-fx-background-color:lightgreen");
        vBoxTwo.setStyle("-fx-background-color:pink");
        
        hBox.getChildren().addAll(vBoxOne,vBoxTwo);
        
        
        
        Scene scene=new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        CheckBox checkBoxOne=new CheckBox("apple");
        CheckBox checkBoxTwo=new CheckBox("orange");
        CheckBox checkBoxThree=new CheckBox("banana");
        CheckBox checkBoxFour=new CheckBox("lichi");
        
        vBoxOne.getChildren().addAll(checkBoxOne,checkBoxTwo,checkBoxThree,checkBoxFour);
       
        checkBoxOne.setOnAction(e->checkBoxAction(checkBoxOne,vBoxOne,vBoxTwo));
        checkBoxTwo.setOnAction(e->checkBoxAction(checkBoxTwo,vBoxOne,vBoxTwo));
        checkBoxThree.setOnAction(e->checkBoxAction(checkBoxThree,vBoxOne,vBoxTwo));
        checkBoxFour.setOnAction(e->checkBoxAction(checkBoxFour,vBoxOne,vBoxTwo));
            

        

    }
    
    private void checkBoxAction(CheckBox checkBox,VBox vBoxOne,VBox vBoxTwo){
        if(checkBox.isSelected()){
            vBoxTwo.getChildren().add(checkBox);
        }
        else if(!(checkBox.isSelected())){
            vBoxOne.getChildren().add(checkBox);
        }
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
