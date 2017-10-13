/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

/**
 *
 * @author fsr19
 */
public class Player {
    private String name;
    
    private Field currentField;
    
    private Field[] map;
    
    public Player(String name, Field startField, Field[] map) {
        this.name = name;
        currentField = startField;
        this.map = map;
    }
    
    public String getName() {
        return name;
    }

    public Field getCurrentField() {
        return currentField;
    }
    
    public void move(Dice die) {
        int t = die.throwDice();
        System.out.println("You threw: " + t);
        
        int nextField = (currentField.getNumber() + t) % 40;
        
        currentField = map[nextField];
        
        System.out.println("You landed on " + currentField.getName());
    }
}
