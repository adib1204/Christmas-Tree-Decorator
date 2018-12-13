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

import res.Index.*;
import dptemplate.Template;
import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_PageController implements Initializable {

    @FXML
    private AnchorPane bg, bar;
    @FXML
    private Button b1, b2, b3, b4, b5, b6;
    @FXML
    private ImageView pokok, tongkat, ribbon, ornament, olaf, gift, star;
    @FXML
    private Label lb2, lb1;
    @FXML
    private Circle circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8;
    @FXML
    private MenuItem factory, fmusic, fskip;

    //Bawah ni ialah class+library yang akan korang gunakan untuk interact dgn UI
    //Then dari UI tu masuk design pattern korang
    //Adib
    private Template tmp;
    private ArrayList<ImageView> templateImage;
    @FXML
    private MenuItem close;

    //Ameer
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTemplate();
        initState();
        initStrategy();
        initFacaTon();
        initFactory();
    }

    @FXML
    private void showposition(MouseEvent event) {
        String x = Double.toString(event.getX());
        String y = Double.toString(event.getY());
        lb1.setText("X: " + x);
        lb2.setText("Y: " + y);
    }

    @FXML
    private void click(ActionEvent event) {
        Button buttonSource = (Button) event.getSource();
        String src = buttonSource.getId();
        switch (src) {
            case "b1":
                tmp.setPresetImage(PRESET.PRESET1);
                break;
            case "b2":
                tmp.setPresetImage(PRESET.PRESET2);
                break;
            case "b3":
                tmp.setPresetImage(PRESET.PRESET3);
                break;
            case "b4":

                break;
            case "b5":

                break;
            case "b6":
                tmp.clearPreset();
                break;
            default:
            //throw new AssertionError();
        }
    }

    @FXML
    private void setMenu(ActionEvent event) throws Exception {
        MenuItem menu = (MenuItem) event.getSource();
        String source = menu.getId();
        switch (source) {
            case "factory":
                Stage stage = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Selection_Page.fxml"));

                Scene scene = new Scene(root, 600, 400);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setMaximized(false);
                stage.setTitle("New Christmas Tree");
                stage.show();

                break;
            case "close":
                Platform.exit();
                break;
            case "fmusic":

                break;
            case "fskip":

                break;
            default:

        }
    }

    private void initTemplate() {
        //Add element/component of the preset into the array
        templateImage = new ArrayList<>();
        templateImage.add(star);
        templateImage.add(tongkat);
        templateImage.add(ribbon);
        templateImage.add(ornament);
        templateImage.add(gift);

        tmp = new Template(templateImage);
    }

    private void initState() {
        //Bagi semua circle animation sama
        circle2.fillProperty().bind(circle1.fillProperty());
        circle3.fillProperty().bind(circle1.fillProperty());
        circle4.fillProperty().bind(circle1.fillProperty());
        circle5.fillProperty().bind(circle1.fillProperty());
        circle6.fillProperty().bind(circle1.fillProperty());
        circle7.fillProperty().bind(circle1.fillProperty());
        circle8.fillProperty().bind(circle1.fillProperty());
    }

    private void initStrategy() {
    }

    private void initFacaTon() {
    }

    private void initFactory() {
    }

}
