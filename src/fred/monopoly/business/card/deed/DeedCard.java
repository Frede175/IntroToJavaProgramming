/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.card.deed;

import fred.monopoly.business.field.OwnebleField;

/**
 *
 * @author fsr19
 */
public abstract class DeedCard {
    private final int fieldPos;
    
    private final int price;
    
    private final int mortgageValue;
    
    private final String name;

    public DeedCard(int fieldPos, int price, int mortgageValue, String name) {
        this.fieldPos = fieldPos;
        this.price = price;
        this.mortgageValue = mortgageValue;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getFieldPos() {
        return fieldPos;
    }

    public int getPrice() {
        return price;
    }

    public int getMortgageValue() {
        return mortgageValue;
    }
    
    public abstract int getRent(int owned);
    
}
