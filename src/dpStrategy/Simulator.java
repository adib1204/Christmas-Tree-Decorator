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
public class Simulator {
        public static void main(String[] args){
                Santa sc = new Santa();
                Raindeer rd = new Raindeer();
                Snowman sm = new Snowman();
                
                sc.performStand();
                rd.performStand();
                sm.performStand();
                
                sc.performJump();
                rd.performJump();
                sm.performJump();
        }
}
