/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

import fred.monopoly.field.*;
import java.util.Scanner;

/**
 *
 * @author fsr19
 */
public class Monopoly {
    
    private Scanner scanner = new Scanner(System.in);
    
    private Field[] map = new Field[40];
    
    private Player[] players;
    
    private Dice dice;
    
    public Monopoly(int numberOfPlayers, int numberOfDice) {
        dice = new Dice(numberOfDice);
        players = new Player[numberOfPlayers];
        
        generateFields();
        
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player("Player" + i, map[0], map);
        }
    }
    
    private void generateFields() {
        for (int i = 0; i < 40; i++) {
            switch(i) {
                case 0:
                    map[i] = new GoField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 10:
                    map[i] = new JailField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 20: 
                    map[i] = new FreeParkingField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 30: 
                    map[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 2:
                case 7:
                case 17:
                case 22:
                case 33:
                case 36:
                    map[i] = new DrawCardField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 4:
                case 38:
                    map[i] = new TaxField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 5:
                case 15:
                case 25:
                case 35:
                    map[i] = new StationField(MonopolyConstants.FIELD_NAMES[i], i);
                    break;
                case 12:
                case 28:
                    map[i] = new UtilityField(MonopolyConstants.FIELD_NAMES[i], i, dice);
                default:
                    map[i] = new PropertyField(MonopolyConstants.FIELD_NAMES[i], i, ColorGroup.getFromMapIndex(i));
            }
        }
    }
    
    public void play() {
        boolean done = false;
        while (!done) {
            
            System.out.println("Next round starting...");
            
            for (Player p : players) {
                System.out.print(p.getName() + " what do you want to do? ");
                
                String move;
                
                boolean proccessed = false;
                
                while (!proccessed) {
                    move = scanner.nextLine().toLowerCase();
                    proccessed = true;
                    switch (move) {
                    case "throw":
                        p.move(dice);
                        processLanding(p);
                        break;
                    default:
                        System.out.print("Could not find that command! Please try agian: ");
                        proccessed = false;
                        break;
                    }
                    
                    if (proccessed && dice.twoEqual()) {
                        System.out.println("You got two equal and get to go again!");
                        proccessed = false;
                    }
                }
                
                
            }
            
            
        }
        
    }
    
    private void processLanding(Player p) {
        if (p.getCurrentField() instanceof OwnebleField) {
            OwnebleField field = (OwnebleField) p.getCurrentField();
            if (!field.isOwned()) {
                System.out.print("Do you want to buy " + field.getName() + "?");
                
            }
        }
    }
    
}
