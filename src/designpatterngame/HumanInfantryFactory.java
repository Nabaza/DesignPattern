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
public class HumanInfantryFactory {
    public InfantryUnit createUnit (int techLevel){
     InfantryUnit character;
     
        switch(techLevel){
            case 1: 
                character = new RockHauler(10, 4, 10, 3);
                
            case 2:
                character = new SpearThrower(10, 3, 10, 5);
                
            case 3:
                character = new Archer(10, 8, 12, 6);
                
            case 4:
                character = new CrossBowMan(10, 8, 12, 6);
                
            case 5:
                character = new Musketeer(10, 5, 10, 5);
                
            default:
                character = null;
                break;
        }
        return character;
    }
}
