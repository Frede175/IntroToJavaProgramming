/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Player;
import fred.monopoly.card.deed.PropertyCard;

/**
 *
 * @author fsr19
 */
public class PropertyField extends OwnebleField {
    
    private final ColorGroup colorFamily;
    
    private int numberOfHouses = 0;
    
    public PropertyField(String name, int number, ColorGroup colorFamily) {
        super(name, number);
        this.colorFamily = colorFamily;
    }
    
    public void buyHouse() {
        PropertyCard card = (PropertyCard) getDeedCard();
        if (numberOfHouses < 5 && ownedBy.ownsAllPropertiesInColorGroup(colorFamily) && card.getHouseCost() <= ownedBy.getMoney()) {
            ownedBy.removeMoney(card.getHouseCost());
            numberOfHouses++;
        }
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (ownedBy != null) {
            if (poorPlayer != ownedBy) {
                int amoutToPay = 0;
                if (ownedBy.ownsAllPropertiesInColorGroup(colorFamily) && numberOfHouses == 0) {
                    amoutToPay = getDeedCard().getRent(numberOfHouses) * 2;
                } else {
                    amoutToPay = getDeedCard().getRent(numberOfHouses);
                }
                
                poorPlayer.removeMoney(amoutToPay);
                System.out.println("You landed on " + getName() + " and have to pay " + amoutToPay + " to " + ownedBy.getName() + ".");
            }
        } else {
            super.consequense(poorPlayer);
        }
    }
    
    public ColorGroup getColorGroup() {
        return colorFamily;
    }
    
}
