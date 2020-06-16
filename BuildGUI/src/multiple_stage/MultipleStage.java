
package multiple_stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
   
        VBox vbox=new VBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        
        Button button=new Button("click here");
        vbox.getChildren().add(button);
        
        
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
                Stage newStage=new Stage();
                VBox vboxOne=new VBox();
                vboxOne.setMinSize(300, 300);
                Scene scene=new Scene(vboxOne);
                newStage.setScene(scene);
                newStage.show();
                primaryStage.close();
                
                
            }
        });
        
        
    }
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
