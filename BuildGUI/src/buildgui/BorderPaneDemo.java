
package buildgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BorderPaneDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane=new BorderPane();
        borderPane.setMinHeight(300);
        borderPane.setMinWidth(500);
        VBox vbox=new VBox();
        vbox.setMinHeight(50);
        vbox.setMinWidth(500);
        borderPane.setTop(vbox);
        vbox.setStyle("-fx-background-color:red");
        
        HBox hbox=new HBox();
        hbox.setMinHeight(50);
        hbox.setMinWidth(500);
        borderPane.setBottom(hbox);
        hbox.setStyle("-fx-background-color:brown");
        
        
        Scene scene=new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
