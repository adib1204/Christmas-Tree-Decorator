package dpfactory;

/**
 *
 * @author Zryggs
 */
public class BackgroundCreator extends ChristmasCreator {
    @Override
    ChristmasProduct createDesign(String item){
        switch (item) {
            case "bg01":
                return new BackgroundOne();
            case "bg02":
                return new BackgroundTwo();
            case "bg03":
                return new BackgroundThree();
            default:
                return null;
        }
    }
}
