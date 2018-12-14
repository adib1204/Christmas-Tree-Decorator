package dpfactory;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import res.Index.*;

public class PokokTwo extends ChristmasProduct{
    private TREE tree;
    public PokokTwo(TREE tree){
        this.tree = tree;
    }
    
    @Override
    public void setImage(Node pane) {
        ImageView iv = (ImageView) pane;
        iv.setImage(tree.getTreeImage());
    }
}
