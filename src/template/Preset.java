package template;

public abstract class Preset {
    private static boolean hideNode=true;

    public static void sethideNode(boolean hideNode) {
        Preset.hideNode = hideNode;
    }
    
    public void onAction(){
        checkHide();
    }
    
    public void checkHide(){
        if(hideNode){
            hideNode=false;
        }
    }
}
