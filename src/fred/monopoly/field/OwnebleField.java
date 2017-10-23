/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Player;
import fred.monopoly.card.Cards;
import fred.monopoly.card.DeedCard;

/**
 *
 * @author fsr19
 */
public class OwnebleField extends Field {
    
    protected boolean isOwned  = false;
    protected Player ownedBy = null;
    
    public OwnebleField(String name, int number) {
        super(name, number);
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (!isOwned) {
            //TODO ask player if they want to buy, if not it need to go on auction
        }
    }
    
    public DeedCard getDeedCard() {
        for (DeedCard card : Cards.DEED_CARDS) {
            if (card.getFieldPos() == getNumber()) {
                return card;
            }
        }
        return null;
    }
}
