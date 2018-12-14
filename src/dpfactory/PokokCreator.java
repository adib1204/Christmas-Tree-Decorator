package dpfactory;

import javafx.scene.image.Image;
import res.Index.*;

public class PokokCreator extends ChristmasCreator {
    
    

    @Override
    ChristmasProduct createDesign(String tree) {
        switch (tree) {
            case "TREE1":
                return new PokokOne(TREE.TREE1);
            case "TREE2":
                return new PokokTwo(TREE.TREE2);
            default:
                return null;
        }
    }
}
