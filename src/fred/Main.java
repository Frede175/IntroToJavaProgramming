package fred;

import fred.monopoly.Monopoly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fsr19
 */
public class Main {
    public static void main(String[] args) {
        Monopoly game = new Monopoly(2, 2);
        
        game.play();
        
    }
    
}
