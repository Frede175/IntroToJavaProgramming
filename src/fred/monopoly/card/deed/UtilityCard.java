/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.card.deed;

import fred.monopoly.field.OwnebleField;

/**
 *
 * @author fsr19
 */
public class UtilityCard extends DeedCard {
    
    private final int oneOwned;
    private final int twoOwned;
    
    

    public UtilityCard(int fieldPos, int price, int mortgageValue, String name, int oneOwned, int twoOwned) {
        super(fieldPos, price, mortgageValue, name);
        this.oneOwned = oneOwned;
        this.twoOwned = twoOwned;
    }

    /**
     * This returns the multiple that the sum of dice is supposed to be multiplied with
     * @param owned
     * @return 
     */
    @Override
    public int getRent(int owned) {
        return owned == 1 ? oneOwned : twoOwned;
    }
    
    
}
