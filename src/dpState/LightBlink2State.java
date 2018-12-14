/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpState;

import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author FiQa
 */
public class LightBlink2State implements State{
    
    Circle circle;
    LightAnimation lightAnimation;
    private boolean playAnimation = false;
    
    public LightBlink2State(Circle circle, LightAnimation lightAnimation){
        this.circle = circle;
        this.lightAnimation = lightAnimation;
    }
    public void clickButton(){
        
        FillTransition ft = lightAnimation.getFt();
        ft.stop();
            
        ft = new FillTransition(Duration.millis(250), circle, Color.RED, Color.BEIGE);
        ft.setCycleCount(Integer.MAX_VALUE);
        ft.setAutoReverse(true);
        lightAnimation.setFt(ft);
        ft.play();
        
        lightAnimation.setState(lightAnimation.getLightOff());
    }
}
