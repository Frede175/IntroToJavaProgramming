/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

import fred.monopoly.Player;
import java.awt.Color;

/**
 *
 * @author fsr19
 */
public class PropertyField extends OwnebleField {
    
    Color colorFamily;
    
    public PropertyField(String name, int number) {
        super(name, number);
    }

    @Override
    public void consequense(Player poorPlayer) {
        if (isOwned) {
            if (poorPlayer != ownedBy) {
                //int amoutToPay
            }
        }
        
        super.consequense(poorPlayer); 
    }
    
    
    
}
