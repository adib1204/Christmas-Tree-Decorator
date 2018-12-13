package dpfactory;

/**
 *
 * @author Zryggs
 */
public class PokokCreator extends ChristmasCreator {
    @Override
    ChristmasProduct createDesign(String item){
        switch (item) {
            case "pk01":
                return new PokokOne();
            case "pk02":
                return new PokokTwo();
            case "pk03":
                return new PokokThree();
            default:
                return null;
        }
    }
}
