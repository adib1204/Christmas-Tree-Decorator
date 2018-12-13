/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpStrategy;

/**
 *
 * @author Chempaka Seri
 */
public class Santa extends Character {
        public Santa(){
                standBehaviour = new CanStand();
                jumpBehaviour = new CanJump();
        }
        
        public void display(){
                System.out.println("I'm a santa");
        }
}
