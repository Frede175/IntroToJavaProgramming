/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Player;
import fred.monopoly.card.Cards;
import fred.monopoly.card.deed.DeedCard;

/**
 *
 * @author fsr19
 */
public abstract class OwnebleField extends Field {
    
    protected boolean isMortgaged = false;
    protected Player ownedBy = null;
    
    public OwnebleField(String name, int number) {
        super(name, number);
    }

    public abstract void consequense(Player poorPlayer);
    
    public DeedCard getDeedCard() {
        for (DeedCard card : Cards.DEED_CARDS) {
            if (card.getFieldPos() == getNumber()) {
                return card;
            }
        }
        return null;
    }
    
    public boolean buyField(Player player) {
        if (canBuy(player)) {
            player.buyField(this);
            ownedBy = player;
            return true;
        }
        return false;
    }
    
    public boolean canBuy(Player player) {
        return getDeedCard().getPrice() >= player.getMoney();
    }
    
    public boolean isOwned() {
        return ownedBy != null;
    }
   
}
