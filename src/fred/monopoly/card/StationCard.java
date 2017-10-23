/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.card;

import fred.monopoly.field.OwnebleField;

/**
 *
 * @author fsr19
 */
public class StationCard extends DeedCard {
    
    /**
     * Should have a length of 4:
     * 0: one owned
     * 1: two owned
     * 2: three owned
     * 3: four owned
     */
    private final int[] rent;
    
    
    public StationCard(int fieldPos, int price, int mortgageValue, String name, int[] rent) {
        super(fieldPos, price, mortgageValue, name);
        this.rent = rent;
    }

    @Override
    public int getRent(int owned) {
        return rent[owned];
    }
    
}
