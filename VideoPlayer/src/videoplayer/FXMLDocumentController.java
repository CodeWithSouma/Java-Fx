/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author souma
 */
public class FXMLDocumentController implements Initializable {
    
    private MediaPlayer mediaPlayer;
    private String filePath;
            
    
    @FXML
    private Label label;
    @FXML
    private MediaView mediaView;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
        FileChooser fileChooser=new FileChooser();
        FileChooser.ExtensionFilter filter=new  FileChooser.ExtensionFilter("mp4 file please.", "*.mp4");
        fileChooser.getExtensionFilters().add(filter);
        File file=new FileChooser().showOpenDialog(null);
        filePath=file.toURI().toString();
        if(filePath!=null){
            Media media=new Media(filePath);
            mediaPlayer=new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
