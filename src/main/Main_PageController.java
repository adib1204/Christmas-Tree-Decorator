/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Main_PageController implements Initializable {
    
    @FXML
    private AnchorPane tree, bg;
    
    private Main_PageModel mpm;
    
    private Random random = new Random();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mpm = new Main_PageModel();
        mpm.createCircle(bg);
    }  
    

    
}
