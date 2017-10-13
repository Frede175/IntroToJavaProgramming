/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

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
            map[i] = new Field("Field" + i, i);
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
                    move = scanner.nextLine();
                    proccessed = true;
                    switch (move) {
                    case "throw":
                        p.move(dice);
                        break;
                    default:
                        System.out.print("Could not find that command! Please try agian: ");
                        proccessed = false;
                        break;
                    }
                }
                
                
            }
            
            
        }
        
    }
    
}
