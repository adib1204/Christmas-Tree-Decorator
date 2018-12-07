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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import res.enumfile.TREE;

public class Main_PageController implements Initializable {

    @FXML
    private AnchorPane bg, bar;

    @FXML
    private Button b1, b2, b3, b4, b5, b6;

    private Main_PageModel mpm;

    private Group g1, g2;
    Button gbtn[];

    private boolean hideButton = false;
    private int tukarPokok = 1;
    private int tukarBg = 1;
    @FXML
    private ImageView pokok;
    @FXML
    private ImageView or1;
    @FXML
    private Label lb2;
    @FXML
    private Label lb1;
    @FXML
    private StackPane PaneLampu;
    @FXML
    private Circle circleBesar;
    @FXML
    private Circle circleKecik;
    @FXML
    private Menu music;
    @FXML
    private ImageView olaf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button gbtn[] = {b1,b2};
        mpm = new Main_PageModel();
        mpm.createCircle(bg);
        g1 = new Group();
        g1.getChildren().addAll(b2, b3);
        bar.getChildren().addAll(g1);
        olaf.setImage(new Image("res/img/olaf.jpg"));
        olaf.setPreserveRatio(false);
        //bg.setStyle(" -fx-background-image:url(/res/img/bg1.jpg);-fx-background-size:stretch");
    }

    private void tukarbg() {
        switch (tukarBg) {
            case 1:
                bg.setId("bg2");
                tukarBg = 2;
                break;
            case 2:
                bg.setId("bg3");
                tukarBg = 3;
                break;
            case 3:
                bg.setId("bg1");
                tukarBg = 1;
                break;
        }
    }
    
    private void tukarPokok() {
        
        switch (tukarPokok) {
            case 1:
                pokok.setImage(TREE.TREE2.getImage());
                tukarPokok = 2;
                break;
            case 2:
                pokok.setImage(TREE.TREE3.getImage());
                tukarPokok = 3;
                break;
            case 3:
                pokok.setImage(TREE.TREE1.getImage());
                tukarPokok = 1;
                break;
            default:
                System.out.println("");
        }
    }

    @FXML
    private void showposition(MouseEvent event) {
        String x = Double.toString(event.getX());
        String y = Double.toString(event.getY());
        lb1.setText("X: "+x);
        lb2.setText("Y: "+y);
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
            case "b2":
                Button b = new Button("pos");
                System.out.println(bg.getId());
                bg.getChildren().add(b);
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
}
