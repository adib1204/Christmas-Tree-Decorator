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
    private AnchorPane bg, bar;

    @FXML
    private Button b1, b2, b3, b4, b5, b6;

    private Main_PageModel mpm;

    private Group g1;

    private boolean hideButton = false;
    private int tukarPokok = 1;
    private int tukarBg = 1;
    @FXML
    private ImageView pokok;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mpm = new Main_PageModel();
        mpm.createCircle(bg);
        g1 = new Group();
        g1.getChildren().addAll(b2, b3);
        bar.getChildren().add(g1);
        bg.setStyle(" -fx-background-image:url(/res/img/bg1.jpg);-fx-background-size:stretch");
        pokok.setImage(new Image("res/img/pokok1.png"));
        pokok.setPreserveRatio(false);
    }

    @FXML
    private void click(ActionEvent event) {
        Button buttonSource = (Button) event.getSource();
        String src = buttonSource.getId();
        switch (src) {
            case "b1":
                if (hideButton) {
                    g1.setVisible(true);
                    hideButton = false;
                } else {
                    g1.setVisible(false);
                    hideButton = true;
                }
                break;
            case "b5":
                tukarPokok();
                break;
            case "b6":
                tukarbg();
                break;
            default:
                throw new AssertionError();
        }

    }

    private void tukarbg() {
        switch (tukarBg) {
            case 1:
                bg.setStyle(" -fx-background-image:url(/res/img/bg2.jpg);-fx-background-size:stretch");
                tukarBg = 2;
                break;
            case 2:
                bg.setStyle(" -fx-background-image:url(/res/img/bg3.jpg);-fx-background-size:stretch");
                tukarBg = 3;
                break;
            case 3:
                bg.setStyle(" -fx-background-image:url(/res/img/bg1.jpg);-fx-background-size:stretch");
                tukarBg = 1;
                break;
        }
    }

    private void tukarPokok() {
        switch (tukarPokok) {
            case 1:
                pokok.setImage(new Image("res/img/pokok2.png"));
                tukarPokok = 2;
                break;
            case 2:
                pokok.setImage(new Image("res/img/pokok3.png"));
                tukarPokok = 3;
                break;
            case 3:
                pokok.setImage(new Image("res/img/pokok1.png"));
                tukarPokok = 1;
                break;
            default:
                throw new AssertionError();
        }
    }

}
