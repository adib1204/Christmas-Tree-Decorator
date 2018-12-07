package main;

import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Main_PageModel {
    private Random random = new Random();

    public void createCircle( AnchorPane bg){

        Circle c[] = new Circle[2000]; 
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(1, 1, 1);
            c[i].setRadius(random.nextDouble() * 5);
            Color color = Color.web("#f0f0f0", random.nextDouble());
            
            c[i].setFill(color);
            bg.getChildren().add(c[i]);
            Raining(c[i],bg);
        }   
    }    
    private void Raining(Circle c, AnchorPane bg) {
        c.setCenterX(random.nextInt(920));//Background width = 920
        int time = 10 + random.nextInt(50);
       
        TranslateTransition tt= new TranslateTransition(Duration.seconds(time), c);
        tt.fromYProperty().setValue(676);
        tt.setToY(0); //Background height = 576
        tt.setToX(random.nextDouble() * c.getCenterX());
        tt.onFinishedProperty().setValue(e ->{
                        Raining(c, bg);
        });
        Animation an = tt;
        an.play();
    }
}
