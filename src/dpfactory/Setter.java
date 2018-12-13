package dpfactory;

import javafx.scene.image.Image;

public class Setter {
    private static Image tree;
    private static String id;
    private static boolean snow;

    public static void setTree(Image tree) {
        Setter.tree = tree;
    }

    public static void setId(String id) {
        Setter.id = id;
    }

    public static void setSnow(boolean snow) {
        Setter.snow = snow;
    }

    public static Image getTree() {
        return tree;
    }

    public static String getId() {
        return id;
    }

    public static boolean isSnow() {
        return snow;
    }
}
