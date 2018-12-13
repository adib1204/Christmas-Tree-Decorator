/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LightState;

import javafx.scene.shape.Circle;

/**
 *
 * @author FiQa
 */
public class LightOnState implements State{
    
    Circle circle;
    LightAnimation lightAnimation;
    
    public LightOnState(Circle circle, LightAnimation lightAnimation){
        this.circle = circle;
        this.lightAnimation = lightAnimation;
    }
    public void clickButton(){
        
    }
}
