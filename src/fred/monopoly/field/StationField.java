/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Player;

/**
 *
 * @author fsr19
 */
public class StationField extends OwnebleField {
    
    public StationField(String name, int number) {
        super(name, number);
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (ownedBy != null) {
            
        } else {
            super.consequense(poorPlayer);
        }
    }
    
}
