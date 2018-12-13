package res;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Index {

    public enum BACKGROUND {
        BG1("res/img/bg1.png"),
        BG2("res/img/bg2.png"),
        BG3("res/img/bg3.png");

        private final Image bgImage;

        private BACKGROUND(String filePath) {
            bgImage = new Image(filePath);
        }

        public Image getBackgroundImage() {
            return bgImage;
        }
    }
    
    public enum TREE {
        TREE1("res/img/tree1.png"),
        TREE2("res/img/tree2.png"),
        TREE3("res/img/tree3.png");
        
        private final Image treeImage;

        private TREE(String treePath) {
            treeImage = new Image(treePath);
        }
        
        public Image getTreeImage() {
            return treeImage;
        }
    }
    
    public enum PRESET {
        PRESET1(
                "res/img/star.png",
                "res/img/tongkat1.png",
                "res/img/ribbon1.png",
                "res/img/ornament1.png",
                "res/img/gift1.png",
                Color.GREEN
                ),
        PRESET2(
                "res/img/star.png",
                "res/img/tongkat2.png",
                "res/img/ribbon2.png",
                "res/img/ornament2.png",
                "res/img/gift2.png",
                Color.DARKGREEN
                ),
        PRESET3(
                "res/img/star.png",
                "res/img/tongkat3.png",
                "res/img/ribbon3.png",
                "res/img/ornament3.png",
                "res/img/gift3.png",
                Color.FORESTGREEN
                );
        
        private final Image starImage, tongkatImage, ribbonImage, ornamentImage, giftImage;
        private ArrayList<Image> imageArray = new ArrayList<>();
        private final Paint color;
        private PRESET(String starPath, String tongkatPath, String ribbonPath, 
                String ornamentPath, String giftPath, Paint color) {
                starImage = new Image(starPath);
                tongkatImage = new Image(tongkatPath);
                ribbonImage = new Image(ribbonPath);
                ornamentImage = new Image(ornamentPath);
                giftImage = new Image (giftPath);
                
                imageArray.add(starImage);
                imageArray.add(tongkatImage);
                imageArray.add(ribbonImage);
                imageArray.add(ornamentImage);
                imageArray.add(giftImage);
                
                this.color = color;
        }
        
        public Image getImage(int index){
            return imageArray.get(index);
        }
        public Paint getColor(){
            return color;
        }
    }
}
