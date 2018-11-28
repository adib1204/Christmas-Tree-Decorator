/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Main_PageController implements Initializable {
    
    @FXML
    private AnchorPane bg,bar;
    
    @FXML
    private Button b1, b2, b3;
    
    private Main_PageModel mpm;
    
    private Group g1;
    
    private boolean hideButton=false;
    private int tukarPokok=1;
    private int tukarBg=1;
    @FXML
    private ImageView pokok;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mpm = new Main_PageModel();
        mpm.createCircle(bg);
        g1 = new Group();
        g1.getChildren().addAll(b2, b3);
        bar.getChildren().add(g1);
        bg.setStyle(" -fx-background-image:url(/res/bg1.jpg);-fx-background-size:stretch");
        pokok.setImage(new Image("res/pokok1.png"));
        pokok.setPreserveRatio(false);
    }  

    @FXML
    private void click(ActionEvent event) {
        if(hideButton){
            g1.setVisible(true);
            hideButton=false;
        }
        else{
            g1.setVisible(false);
            hideButton=true;
        }
    }

    @FXML
    private void tukarbg(ActionEvent event) {
        switch (tukarBg) {
            case 1:
                bg.setStyle(" -fx-background-image:url(/res/bg2.jpg);-fx-background-size:stretch");
                tukarBg=2;
                break;
            case 2:
                bg.setStyle(" -fx-background-image:url(/res/bg3.jpg);-fx-background-size:stretch");
                tukarBg=3;
                break;
            case 3:
                bg.setStyle(" -fx-background-image:url(/res/bg1.jpg);-fx-background-size:stretch");
                tukarBg=1;
                break;
            default:
                throw new AssertionError();
        }
    }

    @FXML
    private void tukarPokok(ActionEvent event) {
        switch (tukarPokok) {
            case 1:
                pokok.setImage(new Image("res/pokok2.png"));
                tukarPokok=2;
                break;
            case 2:
                pokok.setImage(new Image("res/pokok3.png"));
                tukarPokok=3;
                break;
            case 3:
                pokok.setImage(new Image("res/pokok1.png"));
                tukarPokok=1;
                break;
            default:
                throw new AssertionError();
        }
    }

    

    
}
