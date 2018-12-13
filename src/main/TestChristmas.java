package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TestChristmas extends Application {

    Stage mainStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        Scene scene = new Scene(root,1024,576);
        
        mainStage = stage;
        mainStage.setScene(scene);
        mainStage.setTitle("Christmas Tree Decorator");
        mainStage.getIcons().add(new Image("res/img/icon.png"));
        mainStage.setResizable(false);
        mainStage.setMaximized(false);
        mainStage.show();
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
