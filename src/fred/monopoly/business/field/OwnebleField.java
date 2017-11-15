/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business.field;

import fred.monopoly.business.Command;
import fred.monopoly.business.Monopoly;
import fred.monopoly.business.Player;
import fred.monopoly.business.card.Cards;
import fred.monopoly.business.card.deed.DeedCard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    @Override
    public void consequense(Player poorPlayer) {
        if (ownedBy == null) {
            //Ask player if they want to buy
            String input = Command.getCommand("Want to buy the field? ", new ArrayList<>(Arrays.asList("yes", "no")));
            System.out.println(input);
            if (input.equals("yes")) {
                //Player buys the field
                if (poorPlayer.buyField(this)) {
                    System.out.println("You bought the field for " + getDeedCard().getPrice());
                } else {
                    System.out.println("You did not have enough money to buy the field!");
                }
            } else {
                //The field need to go on auction. 
                auctionField();
            }
        }
    }
    
    private void auctionField() {
        Scanner scanner = new Scanner(System.in);
        Player[] players = Monopoly.getInstance().getPlayers();
        int[] amount = new int[players.length];
        boolean[] finalAmount = new boolean[players.length];
        
        int highestIndex = 0;
        
        int count = 0;
        while (count != players.length - 1) {
            count = 0;
            for (int i = 0; i < players.length; i++) {
                if (finalAmount[i]) continue;
                System.out.println(players[i].getName() + " (high: " + amount[highestIndex] + "): ");
                int bid = Command.getNumber("Bid (if lower than highest you are out!)", 0, players[i].getMoney());
                if (bid <= amount[i]) {
                    finalAmount[i] = true;
                } else {
                    highestIndex = i;
                    amount[i] = bid;
                }
                
                if (finalAmount[i]) count++;
            }
        }
        
        System.out.println(players[highestIndex].getName() + " bought the field!");
        players[highestIndex].buyField(this);
    }
    
    public DeedCard getDeedCard() {
        return Cards.DEED_CARDS.getOrDefault(getNumber(), null);
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
