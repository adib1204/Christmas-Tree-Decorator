package res.enumfile;

import javafx.scene.image.Image;

public enum TREE {
    TREE1("res/img/pokok1.png"),
    TREE2("res/img/pokok2.png"),
    TREE3("res/img/pokok3.png");
    
    private final Image POKOK;
    
    private TREE (String path){
        POKOK = new Image(path);
    }
    
    public Image getImage(){
        return POKOK;
    }
}
