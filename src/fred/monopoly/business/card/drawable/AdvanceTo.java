/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.card.drawable;

import fred.monopoly.business.MonopolyConstants;
import fred.monopoly.business.Player;

/**
 *
 * @author fsr19
 */
public class AdvanceTo extends Card {

    private final int mapPos;
    private final boolean canCollect;
    
    public AdvanceTo(String text, int mapPos, boolean canCollect) {
        super(text);
        this.mapPos = mapPos;
        this.canCollect = canCollect;
    }

    @Override
    public void execute(Player player) {
        int currentPos = player.getCurrentField();
        if (mapPos < currentPos && canCollect) {
            //Collection Go money
            player.addMoney(MonopolyConstants.PASSING_START);
        }
        player.setPos(mapPos);
    }
    
}
