/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpState;

import javafx.animation.FillTransition;
import javafx.scene.shape.Circle;

/**
 *
 * @author FiQa
 */
public class LightAnimation {
    
    private State lightOn;
    private State lightOff;
    private State lightBlink2;
    private State lightBlink;
    
    private Circle circle;
    private FillTransition ft;
    
    private State state;
    
    public LightAnimation(Circle circle){
        this.circle = circle;
        lightOn = new LightOnState(circle, this);
        lightOff = new LightOffState(circle, this);
        lightBlink = new LightBlinkState(circle, this);
        lightBlink2 = new LightBlink2State(circle, this);
        state = lightOn;
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
      public State getLightOn() {
        return lightOn;
    }
    public State getLightOff() {
        return lightOff;
    }
    public State getLightBlink() {
        return lightBlink;
    }
    public State getLightBlink2(){
        return lightBlink2;
    }
    public void clickButton(){
        state.clickButton();
    }
}
