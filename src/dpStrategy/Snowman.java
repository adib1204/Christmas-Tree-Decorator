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
public class Snowman extends Character{
        public Snowman(){
                standBehaviour = new NoStand();
                jumpBehaviour = new NoJump();
        }
        
        public void display(){
                System.out.println("I'm a snowman");
        }
}
