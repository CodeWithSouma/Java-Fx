
package buildgui;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BuildGUI extends Application {

    private Button button;
    private Label label;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
//        StackPane pane=new StackPane();
//        pane.setMinHeight(300);
//        pane.setMinWidth(400);
        button=new Button("Click Me");
        //pane.getChildren().add(button);
        //Scene scene=new Scene(pane);
        //primaryStage.setScene(scene);
        primaryStage.show();
        VBox vbox=new VBox();
       // HBox vbox=new HBox();
        vbox.setMinHeight(300);
        vbox.setMinWidth(500);
        TextField textField=new TextField();
        textField.setMaxWidth(250);
        textField.setAlignment(Pos.CENTER);
        
        label = new Label();
        label.setMinHeight(25);
        label.setMinWidth(255);
        label.setAlignment(Pos.CENTER);
        
        vbox.getChildren().add(label);
        
        
       // pane.getChildren().add(textField);
        vbox.getChildren().addAll(textField,button);
        Scene scene=new Scene(vbox);
        primaryStage.setScene(scene);
        
        
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        
        button.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(event.getSource()==button){
                    label.setText("hello " + textField.getText()+ " !!! How are you ???");
                }
                
            }
        });
        
        
           
            
       primaryStage.setTitle("On Action Listener Demo");
       
        vbox.setStyle("-fx-background-color: red");
        
    }
    
     public static void main(String[] args) {
         launch(args);

    }


    
}
 