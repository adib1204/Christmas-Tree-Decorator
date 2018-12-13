package dptemplate;

import java.util.ArrayList;
import javafx.scene.image.ImageView;
import res.Index.*;

public class Template {

    private final ArrayList<ImageView> templateArray;

    public Template(ArrayList<ImageView> templateArray) {
        this.templateArray = templateArray;
    }

    public final void setPresetImage(PRESET preset) {
        setVisible();
        setImage(preset);
    }

    public final void clearPreset() {
        for (ImageView iv : templateArray) {
            iv.setVisible(false);
        }
    }

    private void setVisible() {
        for (ImageView iv : templateArray) {
            iv.setVisible(true);
        }
    }

    private void setImage(PRESET preset) {
        for (int i = 0; i < templateArray.size(); i++) {
            templateArray.get(i).setImage(preset.getImage(i));
        }
    }
}
