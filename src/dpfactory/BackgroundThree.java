package dpfactory;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import res.Index.*;
public class BackgroundThree extends ChristmasProduct{
    private String id;
    public BackgroundThree(String id){
        this.id = id;
    }

    @Override
    public void setImage(Node pane) {
        AnchorPane ap = (AnchorPane) pane;
        ap.setId(id);
    }
}
