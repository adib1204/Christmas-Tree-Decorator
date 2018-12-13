/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LightState;

import javafx.animation.FillTransition;
import javafx.scene.shape.Circle;

/**
 *
 * @author FiQa
 */
public class LightAnimation {
    
    private State lightOn;
    private State lightOff;
    private State lightBlink;
    private Circle circle;
    private FillTransition ft;
    
    private State state = lightOff;
    
    public LightAnimation(Circle circle){
        this.circle = circle;
        ft = new FillTransition();
        lightOn = new LightOnState(circle, this);
        lightOff = new LightOffState(circle, this);
        lightBlink = new LightBlinkState(circle, this);
        
    }
    public void setFt(FillTransition ft) {
        this.ft = ft;
    }
    public FillTransition getFt() {
        return ft;
    }
    public void setState(State newState){
        state = newState;
    }
    public State getState(){
        return state;
    }
    public void clickButton(){
        state.clickButton();
    }
}
