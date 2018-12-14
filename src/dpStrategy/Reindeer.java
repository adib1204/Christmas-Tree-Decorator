package dpStrategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import res.Index.*;

public class Reindeer implements Avatar {
    
    private final ImageView iv;
    private final Image stand = PRESET.PRESET1.getImage(5);
    private final Image walk = PRESET.PRESET1.getImage(6);
    MoveBehaviour walking, standing;
    public Reindeer(ImageView iv) {
        this.iv = iv;
        walking = new CanWalk();
        standing = new NoWalk();
    }

    @Override
    public void performMove(boolean isStanding) {
        if(isStanding){
            walking.move(iv, walk);
        }
        else{
            standing.move(iv, stand);
        }
    }

}
