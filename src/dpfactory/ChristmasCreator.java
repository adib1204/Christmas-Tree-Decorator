
package dpfactory;

/**
 *
 * @author Zryggs
 */
public abstract class ChristmasCreator {
    abstract ChristmasProduct createDesign(String item);
    
    public ChristmasProduct orderDesign(String type){
        ChristmasProduct factory = createDesign(type);
        
        return factory;
    }
}
