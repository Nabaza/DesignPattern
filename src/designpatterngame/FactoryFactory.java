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
public class FactoryFactory {
    
    InfantryFactory factory;
    
    public InfantryFactory createInfantryFactory(int race){
        switch(race){
            case 1:
                factory = new HumanInfantryFactory();
                break;
                
            case 2:
                factory = new OrcInfantryFactory();
                break;
                
            default:
                factory = null;
                break;       
            
        }
        return factory;
    }
    
}
