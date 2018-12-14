package res;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Index {
    
    public enum TREE {
        TREE1("res/img/tree1.png"),
        TREE2("res/img/tree2.png");
        
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
                "res/img/reindeer.jpg",
                "res/img/reindeer_walking.gif"
                ),
        PRESET2(
                "res/img/star.png",
                "res/img/tongkat2.png",
                "res/img/ribbon2.png",
                "res/img/ornament2.png",
                "res/img/gift2.png",
                "res/img/santa.png",
                "res/img/santa_walk.gif"
                ),
        PRESET3(
                "res/img/star.png",
                "res/img/tongkat3.png",
                "res/img/ribbon3.png",
                "res/img/ornament3.png",
                "res/img/gift3.png",
                "res/img/snowman.png",
                "res/img/snowman.png"
                );
        
        private final Image starImage, tongkatImage, ribbonImage, ornamentImage, 
                giftImage, standImage, walkImage;
        private ArrayList<Image> imageArray = new ArrayList<>();
        private final Color color;
        private PRESET(String starPath, String tongkatPath, String ribbonPath, 
                String ornamentPath, String giftPath, String standPath, 
                String walkPath) {
                starImage = new Image(starPath);
                tongkatImage = new Image(tongkatPath);
                ribbonImage = new Image(ribbonPath);
                ornamentImage = new Image(ornamentPath);
                giftImage = new Image(giftPath);
                standImage = new Image(standPath);
                walkImage = new Image(walkPath);
                
                imageArray.add(starImage);
                imageArray.add(tongkatImage);
                imageArray.add(ribbonImage);
                imageArray.add(ornamentImage);
                imageArray.add(giftImage);
                imageArray.add(standImage);
                imageArray.add(walkImage);
                
                this.color = Color.web("#3A5F0B", 0.5);
        }
        
        public Image getImage(int index){
            return imageArray.get(index);
        }
        public Paint getColor(){
            return color;
        }
    }
}
