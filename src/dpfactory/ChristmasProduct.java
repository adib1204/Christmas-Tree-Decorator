
package dpfactory;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;


public abstract class ChristmasProduct {
    
    private boolean isSnowing;
    
    public void setSnow(AnchorPane bg){
        if(Setter.isSnow() && !isSnowing){
            Snow snow = Snow.getSnow();
            snow.createCircle(bg);
        }
        else if(!Setter.isSnow() && isSnowing){
            isSnowing = Setter.isSnow();
        }
    }
    
    public abstract void setImage(Node node);
}
