/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterngame;

/**
 *
 * @author nabaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RockHauler rock = new RockHauler(10, 4, 10, 3);
        SpearThrower spearman = new SpearThrower(10, 3, 10, 5 );
        Archer arch = new Archer(10, 8, 12, 6);
        CrossBowMan cbman = new CrossBowMan (10, 8, 12, 6);
        Musketeer musk = new Musketeer(10, 5, 10, 5);
        
     while (cbman.getHits()>0 && spearman.getHits()>0){
         cbman.attack(spearman);
         spearman.attack(cbman);
         System.out.println("Crossbowman has life: "+cbman.getHits());
         System.out.println("Spearman has life: "+spearman.getHits());
     }   
    }
    
}
