package dpfactory;

/**
 *
 * @author Zryggs
 */
public class TestDesign {
    public static void main(String[] args){
        ChristmasCreator background = new BackgroundCreator();
        ChristmasCreator pokok = new PokokCreator();
        
        ChristmasProduct design = background.orderDesign("bg01");
        
        design = pokok.orderDesign("pk01");
        
        design = background.orderDesign("bg02");
        
        design = pokok.orderDesign("pk02");
        
        design = background.orderDesign("bg03");
        
        design = pokok.orderDesign("pk03");
    }
}
