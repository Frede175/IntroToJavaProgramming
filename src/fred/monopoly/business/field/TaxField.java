/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.field;

import fred.monopoly.business.MonopolyConstants;
import fred.monopoly.business.Player;

/**
 *
 * @author fsr19
 */
public class TaxField extends Field {

    public TaxField(String name, int number) {
        super(name, number);
    }

    @Override
    public void consequense(Player poorPlayer) {
        poorPlayer.removeMoney(MonopolyConstants.INCOME_TAX);
        System.out.println("You paid " + MonopolyConstants.INCOME_TAX + " in tax");
    }
    
}
