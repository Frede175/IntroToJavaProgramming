/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.field;

import fred.monopoly.business.Monopoly;
import fred.monopoly.business.MonopolyConstants;
import fred.monopoly.business.Player;

/**
 *
 * @author fsr19
 */
public class GoToJailField extends Field {
    
    private Field jailField;
    
    public GoToJailField(String name, int number, Field jail) {
        super(name, number);
        this.jailField = jail;
    }

    @Override
    public void consequense(Player poorPlayer) {
        System.out.println("You went to jail");
        poorPlayer.setPos(MonopolyConstants.JAIL_POS);
        jailField.consequense(poorPlayer);
    }
    
}
