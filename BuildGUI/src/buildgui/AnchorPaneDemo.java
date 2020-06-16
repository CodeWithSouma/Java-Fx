
package buildgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AnchorPaneDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        AnchorPane anchorPane=new AnchorPane();
        anchorPane.setMinHeight(400);
        anchorPane.setMinWidth(600);
        Button button=new Button("hello souma");
        button.setLayoutX(100);
        button.setLayoutY(80);
        anchorPane.getChildren().add(button);
        
        TextField textField=new TextField();
        textField.setMinWidth(200);
        textField.setLayoutX(45);
        textField.setLayoutY(45);
        anchorPane.getChildren().add(textField);
        
        
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
