/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpStrategy;

public abstract class Character {
            StandBehaviour standBehaviour;
            JumpBehaviour jumpBehaviour;
            
            public Character(){
                
            }
            
            public void setStandBehaviour(StandBehaviour sb){
                    standBehaviour = sb;
            }
            
            public void setJumpBehaviour(JumpBehaviour jb){
                    jumpBehaviour = jb;
            }
            
            abstract void display();
            
            public void performStand(){
                    standBehaviour.stand();
            }
            
            public void performJump(){
                    jumpBehaviour.jump();
            }
            
            
}
