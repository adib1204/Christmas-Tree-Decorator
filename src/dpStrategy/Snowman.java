/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpStrategy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import res.Index;

public class Snowman implements Avatar{
    
    private final ImageView iv;
    private final Image stand = Index.PRESET.PRESET3.getImage(5);
    private final Image walk = Index.PRESET.PRESET3.getImage(6);
    MoveBehaviour walking, standing;
    public Snowman(ImageView iv){
        this.iv = iv;
        walking = new CanWalk();
        standing = new NoWalk();
        }

    @Override
    public void performMove(boolean standing) {
        if(standing){
            walking.move(iv, walk);
        }
        else{
            walking.move(iv, stand);
        }
    }
        
}
