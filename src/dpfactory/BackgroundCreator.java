package dpfactory;

import javafx.scene.image.Image;
import res.Index.*;

public class BackgroundCreator extends ChristmasCreator {
    @Override
    ChristmasProduct createDesign(String id){
        ChristmasProduct pr;
        switch (id) {
            case "bg1":
                return new BackgroundOne(id);
            case "bg2":
                return new BackgroundTwo(id);
            case "bg3":
                return new BackgroundThree(id);
            default:
                return null;
        }
    }
}
