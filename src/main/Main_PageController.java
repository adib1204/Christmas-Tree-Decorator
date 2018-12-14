/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import res.Index.*;
import dpState.LightAnimation;
import dpfactory.*;
import dpFacaTon.Sound;
import dptemplate.Template;
import dpStrategy.*;

public class Main_PageController implements Initializable {

    @FXML
    private AnchorPane bg, bar;
    @FXML
    private Button b1, b2, b3, b4, b5, b6;
    @FXML
    private ImageView pokok, tongkat, ribbon, ornament, olaf, gift, star;
    @FXML
    private Circle circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8;
    @FXML
    private MenuItem factory, fmusic, fskip, close;

    //Adib
    private Template tmp;
    private ArrayList<ImageView> templateImage;
    private PRESET preset=PRESET.PRESET1;
    //Ratu
    private Sound sound;
    //Afiqah
    private LightAnimation lightAnimation;
    //Ameer
    private ChristmasCreator background, tree;
    //Chempaka
    private Avatar reindeer, santa, snowman;
    private boolean standing;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTemplate();
        initState();
        initStrategy();
        initFacaTon();
        initFactory();
    }

    @FXML
    private void click(ActionEvent event) {
        Button buttonSource = (Button) event.getSource();
        String src = buttonSource.getId();
        switch (src) {
            case "b1":
                preset = PRESET.PRESET1;
                tmp.setPresetImage(preset);
                standing=true;
                break;
            case "b2":
                preset = PRESET.PRESET2;
                tmp.setPresetImage(preset);
                standing=true;
                break;
            case "b3":
                preset = PRESET.PRESET3;
                tmp.setPresetImage(preset);
                standing=true;
                break;
            case "b4":
                lightAnimation.clickButton();
                break;
            case "b5":
                chooseStrategy();
                break;
            case "b6":
                tmp.clearPreset();
                break;
            default:
            //throw new AssertionError();
        }
    }
    private void chooseStrategy() {
        switch (preset) {
            case PRESET1:
                reindeer.performMove(standing);
                break;
            case PRESET2:
                santa.performMove(standing);
                break;
            case PRESET3:
                snowman.performMove(standing);
            default:
        }
        
        standing = !standing;
    }

    @FXML
    private void setMenu(ActionEvent event) throws Exception {
        MenuItem menu = (MenuItem) event.getSource();
        String source = menu.getId();
        switch (source) {
            case "factory":
                setNewWindow();
                ChristmasProduct gambarBG = background.orderDesign(Setter.getId());
                ChristmasProduct gambarTR = tree.orderDesign(Setter.getTree().toString());
                gambarBG.setImage(bg);
                gambarBG.setSnow(bg);
                gambarTR.setImage(pokok);
                tmp.clearPreset();
                break;
            case "close":
                Platform.exit();
                break;
            case "fmusic":
                sound.trackSong(fmusic);
                break;
            case "fskip":
                sound.nextSong();
                break;
            default:

        }
    }

    private void setNewWindow() throws IOException {
        Stage stage = new Stage();
        
        Parent root = FXMLLoader.load(getClass().getResource("Selection_Page.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setMaximized(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("New Christmas Tree");
        stage.showAndWait();
    }

    private void initTemplate() {
        //Add element/component of the imageView into the array
        templateImage = new ArrayList<>();
        templateImage.add(star);
        templateImage.add(tongkat);
        templateImage.add(ribbon);
        templateImage.add(ornament);
        templateImage.add(gift);
        templateImage.add(olaf);
        
        //bind visibility of the button
        b4.visibleProperty().bind(b6.visibleProperty());
        b5.visibleProperty().bind(b6.visibleProperty());
        
        tmp = new Template(templateImage, circle1, b6);
        //Hide all first
        tmp.clearPreset();
    }

    private void initState() {
        lightAnimation = new LightAnimation(circle1);
        //Bagi semua circle animation sama
        circle2.fillProperty().bind(circle1.fillProperty());
        circle3.fillProperty().bind(circle1.fillProperty());
        circle4.fillProperty().bind(circle1.fillProperty());
        circle5.fillProperty().bind(circle1.fillProperty());
        circle6.fillProperty().bind(circle1.fillProperty());
        circle7.fillProperty().bind(circle1.fillProperty());
        circle8.fillProperty().bind(circle1.fillProperty());
        //Bagi semua visible or invisible
        circle2.visibleProperty().bind(circle1.visibleProperty());
        circle3.visibleProperty().bind(circle1.visibleProperty());
        circle4.visibleProperty().bind(circle1.visibleProperty());
        circle5.visibleProperty().bind(circle1.visibleProperty());
        circle6.visibleProperty().bind(circle1.visibleProperty());
        circle7.visibleProperty().bind(circle1.visibleProperty());
        circle8.visibleProperty().bind(circle1.visibleProperty());
    }

    private void initStrategy() {
        reindeer = new Reindeer(olaf);
        santa = new Santa(olaf);
        snowman = new Snowman(olaf);
    }

    private void initFacaTon() {
        sound = Sound.getInstance();
    }

    private void initFactory() {
        background = new BackgroundCreator();
        tree = new PokokCreator();
    }

    

}
