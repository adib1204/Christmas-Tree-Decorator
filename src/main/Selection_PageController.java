package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import res.Index.*;
import dpfactory.Setter;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Selection_PageController implements Initializable {

    @FXML
    private RadioButton rbg1, rbg2, rbg3, rtr1, rtr2;
    @FXML
    private AnchorPane prev;
    @FXML
    private ImageView pokok;
    @FXML
    private CheckBox snow;
    
    private TREE tree=TREE.TREE1;
    private boolean snowing=false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup bgGroup = new ToggleGroup();
        rbg1.setToggleGroup(bgGroup);
        rbg1.setSelected(true);
        rbg2.setToggleGroup(bgGroup);
        rbg3.setToggleGroup(bgGroup);
        
        ToggleGroup trGroup = new ToggleGroup();
        rtr1.setToggleGroup(trGroup);
        rtr1.setSelected(true);
        rtr2.setToggleGroup(trGroup);
    }    

    @FXML
    private void changeBG(ActionEvent event) {
        RadioButton rb = (RadioButton) event.getSource();
        String src = rb.getId();
        switch (src) {
            case "rbg1":
                prev.setId("bg1");
                break;
            case "rbg2":
                prev.setId("bg2");
                break;
            case "rbg3":
                prev.setId("bg3");
                break;
            default:
                
        }
    }

    @FXML
    private void changeTr(ActionEvent event) {
        RadioButton rb = (RadioButton) event.getSource();
        String src = rb.getId();
        switch (src) {
            case "rtr1":
                tree = TREE.TREE1;
                pokok.setImage(tree.getTreeImage());
                break;
            case "rtr2":
                tree = TREE.TREE2;
                pokok.setImage(tree.getTreeImage());
                break;
            default:
                
                break;
                
        }
        
    }

    @FXML
    private void wantSnow(ActionEvent event) {
        if(snow.isSelected()) snowing = true;
        else snowing=false;
    }

    @FXML
    private void onClick(ActionEvent event) {
        Setter.setId(prev.getId());
        Setter.setSnow(snowing);
        Setter.setTree(tree);
        
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
    
}
