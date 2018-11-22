package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TestChristmas extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        
        Scene scene = new Scene(root,1024,576);
        
        stage.setScene(scene);
        stage.setTitle("Christmas Tree Decorator");
        stage.getIcons().add(new Image("res/icon.png"));
        stage.setResizable(false);
        stage.setMaximized(false);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
