package dpStrategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface MoveBehaviour {
        public void move(ImageView iv, Image img);
}

class NoWalk implements MoveBehaviour {

    @Override
    public void move(ImageView iv, Image img) {
        iv.setImage(img);
    }
}

class CanWalk implements MoveBehaviour{

    @Override
    public void move(ImageView iv, Image img) {
        iv.setImage(img);
    }
}
