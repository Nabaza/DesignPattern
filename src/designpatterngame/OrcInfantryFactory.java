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
public class OrcInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;

        switch (techLevel) {
            case 1:
                character = new Orc(10, 5, 15, 4);

            case 2:
                character = new Urukhai(10, 6, 18, 5);
                
            case 3:
                character = new Sunshine(15, 10, 50, 15);
                
            case 4:
                character = new Rainbow(10, 8, 25, 10);
                
            case 5: 
                character = new Thunder(10, 9, 20, 12);

            default:
                character = null;
                break;
        }
        return character;
    }
}
