package dptemplate;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import res.Index.*;

public class Template {

    private final ArrayList<ImageView> templateArray;
    private static Circle circle;
    private static PRESET pres;
    private static Button btn;

    public static Paint getFill() {
        return pres.getColor();
    }

    public Template(ArrayList<ImageView> templateArray, Circle circle, Button btn) {
        this.templateArray = templateArray;
        this.circle = circle;
        this.btn = btn;
    }

    public final void setPresetImage(PRESET preset) {
        pres = preset;
        setImageVisible();
        setCircleVisible();
        setButtonVisible();
        setImage(preset);
        setCircleColor(preset);
    }

    private void setImageVisible() {
        for (ImageView iv : templateArray) {
            iv.setVisible(true);
        }
    }

    private void setCircleVisible() {
        circle.setVisible(true);
    }

    private void setButtonVisible() {
        btn.setVisible(true);
    }

    private void setImage(PRESET preset) {
        for (int i = 0; i < templateArray.size(); i++) {
            templateArray.get(i).setImage(preset.getImage(i));
        }
    }

    private void setCircleColor(PRESET preset) {
        circle.setFill(preset.getColor());
    }

    public final void clearPreset() {
        setImageInvisible();
        setCircleInvisible();
        setButtonInvisible();
    }

    private void setImageInvisible() {
        for (ImageView iv : templateArray) {
            iv.setVisible(false);
        }
    }

    private void setCircleInvisible() {
        circle.setVisible(false);
    }

    private void setButtonInvisible() {
        btn.setVisible(false);
    }
}
