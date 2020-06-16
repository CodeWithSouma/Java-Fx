
package scenebuilderdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class SceneBuilderDemo extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Parent anchorPane = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
        

    }
    
}
