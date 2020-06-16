
package buildgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class LoginApp extends Application  {
   
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        String password="Soumadip1";
        String userID="souma.hitech@gmail.com";
        
        primaryStage.setTitle("Login App Demo");
        primaryStage.getIcons().add(new Image(LoginApp.class.getResourceAsStream("login.png")));
        
        BorderPane borderPane=new BorderPane();
        borderPane.setMinHeight(400);
        borderPane.setMinWidth(600);
        Scene scene=new Scene(borderPane);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        VBox vBoxOne=new VBox();
        vBoxOne.setMinHeight(40);
        vBoxOne.setStyle("-fx-background-color:lightgray;-fx-border-color:black");
        borderPane.setTop(vBoxOne);
        
        VBox vBoxTwo=new VBox();
        vBoxTwo.setMinHeight(40);
        vBoxTwo.setStyle("-fx-background-color:lightgray;-fx-border-color:black");
        borderPane.setBottom(vBoxTwo);
        
        Label labelOne = new Label();
        Label labelTwo=new Label();
        labelOne.setMinHeight(20);
        labelOne.setMinWidth(250);
        labelTwo.setMinHeight(40);
        labelTwo.setMinWidth(350);
        labelOne.setAlignment(Pos.CENTER);
        labelOne.setText("Login App");
        labelOne.setFont(new Font("Arial",24));
        vBoxOne.setAlignment(Pos.CENTER);
        vBoxOne.getChildren().add(labelOne);
        vBoxTwo.getChildren().add(labelTwo);
        
        AnchorPane centerAnchorPane=new AnchorPane();
        centerAnchorPane.setStyle("-fx-background-color:lightblue");
        borderPane.setCenter(centerAnchorPane);
        
        Label userIDLabel=new Label("User ID: ");
        userIDLabel.setFont(new Font("Arial",15));
        userIDLabel.setMinSize(150, 25);
        userIDLabel.setAlignment(Pos.CENTER);
        userIDLabel.setLayoutX(55);
        userIDLabel.setLayoutY(45);
        centerAnchorPane.getChildren().add(userIDLabel);
        
        TextField userIDField=new TextField();
        userIDField.setMinSize(250, 25);
        userIDField.setLayoutX(185);
        userIDField.setLayoutY(45);
        userIDField.setFont(new Font("Arial", 10));
        centerAnchorPane.getChildren().add(userIDField);
        
        
        Label passwordLabel=new Label("Password: ");
        passwordLabel.setFont(new Font("Arial",15));
        passwordLabel.setMinSize(150, 25);
        passwordLabel.setAlignment(Pos.CENTER);
        passwordLabel.setLayoutX(55);
        passwordLabel.setLayoutY(85);
        centerAnchorPane.getChildren().add(passwordLabel);
        
        PasswordField passwordField=new PasswordField();
        passwordField.setMinSize(250, 25);
        passwordField.setLayoutX(185);
        passwordField.setLayoutY(85);
        passwordField.setFont(new Font("Arial", 10));
        centerAnchorPane.getChildren().add(passwordField);
        
        Button loginButton=new Button("login");
        loginButton.setMinSize(80, 25);
        loginButton.setLayoutX(265);
        loginButton.setLayoutY(140);
        loginButton.setFont(new Font("Arial", 10));
        centerAnchorPane.getChildren().add(loginButton);
        
        Label messageLabel=new Label();
        messageLabel.setFont(new Font("Arial",15));
        messageLabel.setMinSize(150, 25);
        messageLabel.setAlignment(Pos.CENTER);
        messageLabel.setLayoutX(160);
        messageLabel.setLayoutY(200);
        centerAnchorPane.getChildren().add(messageLabel);
        
        
        
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(userIDField.getText().trim().equals("souma.hitech@gmail.com")&&passwordField.getText().trim().equals("Soumadip1")){
                    messageLabel.setText("Wellcome alians....you have succesfully logedin.");
                }
                else{
                    messageLabel.setText("Sorry user name or password was not matched.");
                }
                
            }
        });
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    
}
