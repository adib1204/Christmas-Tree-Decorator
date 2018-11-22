/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class Main_PageController implements Initializable {
    
    @FXML
    private AnchorPane tree, bg;
    
    private Main_PageModel mpm;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mpm = new Main_PageModel();
        mpm.createCircle(bg);
    }  
    

    
}
