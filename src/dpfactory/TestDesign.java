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
        System.out.println(design.getName()+" is choosen\n");
        
        design = pokok.orderDesign("pk01");
        System.out.println(design.getName()+" is choosen\n");
        
        design = background.orderDesign("bg02");
        System.out.println(design.getName()+" is choosen\n");
        
        design = pokok.orderDesign("pk02");
        System.out.println(design.getName()+" is choosen\n");
        
        design = background.orderDesign("bg03");
        System.out.println(design.getName()+" is choosen\n");
        
        design = pokok.orderDesign("pk03");
        System.out.println(design.getName()+" is choosen\n");
    }
}
