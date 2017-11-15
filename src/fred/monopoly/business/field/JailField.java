/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.field;

import fred.monopoly.business.Player;

/**
 *
 * @author fsr19
 */
public class JailField extends Field {

    public JailField(String name, int number) {
        super(name, number);
    }

    @Override
    public void consequense(Player poorPlayer) {
        poorPlayer.setInJail(true);
        System.out.println("You are in jail, and have to wait one turn");
    }
    
}
