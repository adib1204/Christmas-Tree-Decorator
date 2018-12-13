/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LightState;

import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author FiQa
 */
public class LightOffState implements State{
    
    Circle circle;
    LightAnimation lightAnimation;
    
    public LightOffState(Circle circle, LightAnimation lightAnimation){
        this.circle = circle;
        this.lightAnimation = lightAnimation;
    }
    public void clickButton(){
//        FillTransition ft = lightAnimation.getFt();
//        //ft.stop();
//        circle.setFill(Color.BLACK

        FillTransition ft = new FillTransition(Duration.millis(1000), circle, Color.BLACK, Color.BLACK);
        ft.setCycleCount(Integer.MAX_VALUE);
        ft.setAutoReverse(true);
        ft.play();
    }
}
