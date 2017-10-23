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
public class PropertyCard extends DeedCard {
    
    private final int houseCost;
    
    /**
     * Should a an array of 6 integers. Where
     * 0: no houses
     * 1: one house
     * 2: two houses
     * 3: three houses
     * 4: four houses
     * 5: hotel
     */
    private final int[] rent;
    
    
    public PropertyCard(int fieldPos, int price, int mortgageValue, String name, int houseCost, int[] rent) {
        super(fieldPos, price, mortgageValue, name);
        this.houseCost = houseCost;
        this.rent = rent;
    }
    
    /**
     * Returns the rent for the number of properties on the field.
     * @param numberOfProperties 0: no houses, 5: hotel. Otherwise 1 is for one house and so on.
     * @return the rent for the number of properties.
     */
    public int getRent(int numberOfProperties) {
        return rent[numberOfProperties];
    }
}
