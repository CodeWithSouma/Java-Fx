
package multiple_scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MultipleScene extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox vBoxOne=new VBox();
        vBoxOne.setMinHeight(300);
        vBoxOne.setMinWidth(500);
        vBoxOne.setAlignment(Pos.CENTER);
        vBoxOne.setSpacing(20);
        
        Button buttonOne=new Button("click me");
        buttonOne.setMinSize(40, 25);
        Label labelOne = new Label("this is scene one");
        labelOne.setFont(new Font("Arial",15));
                
        vBoxOne.getChildren().add(labelOne);
        vBoxOne.getChildren().add(buttonOne);
        vBoxOne.setStyle("-fx-background-color:red");
        
        Scene sceneOne=new Scene(vBoxOne);
        primaryStage.setScene(sceneOne);
        primaryStage.show();
        
        
        VBox vBoxTwo=new VBox();
        vBoxTwo.setMinHeight(300);
        vBoxTwo.setMinWidth(500);
        vBoxTwo.setAlignment(Pos.CENTER);
        vBoxTwo.setSpacing(20);
        
        Button buttonTwo=new Button("click me");
        buttonTwo.setMinSize(40, 25);
        Label labelTwo = new Label("this is scene two");
        labelTwo.setFont(new Font("Arial",15));
         
        vBoxTwo.getChildren().add(labelTwo);
        vBoxTwo.getChildren().add(buttonTwo);
        vBoxTwo.setStyle("-fx-background-color:lightgreen");
        
        
        Scene sceneTwo = new Scene(vBoxTwo);
        
        
        buttonOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             primaryStage.setScene(sceneTwo);
                
            }
        });
        
        buttonTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            primaryStage.setScene(sceneOne);

            }
        });
        
        
        

    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    
}
