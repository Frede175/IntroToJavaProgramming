/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.card.drawable;

import fred.monopoly.business.Player;

/**
 *
 * @author fsr19
 */
public abstract class Card {
    
    private String text;
    
    public Card(String text) {
        this.text = text;
    }
    
    public void printText() {
        System.out.println(text);
    }
    
    public abstract void execute(Player player);
}
