/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LightState;

import javafx.scene.paint.Color;
import javafx.animation.FillTransition;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author FiQa
 */
public class LightBlinkState implements State{
    
    Circle circle;
    LightAnimation lightAnimation;
    private boolean playAnimation = false;
    
    public LightBlinkState(Circle circle, LightAnimation lightAnimation){
        this.circle = circle;
        this.lightAnimation = lightAnimation;
    }
    public void clickButton(){
        
        FillTransition ft = new FillTransition(Duration.millis(1000), circle, Color.BLUE, Color.YELLOW);
        ft.setCycleCount(Integer.MAX_VALUE);
        ft.setAutoReverse(true);
        lightAnimation.setFt(ft);
        ft.play();
        
        lightAnimation.setState(lightAnimation.getLightBlink2());
        
    }
}
