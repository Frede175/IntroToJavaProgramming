/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

import fred.monopoly.card.DeedCard;
import fred.monopoly.field.Field;
import fred.monopoly.field.OwnebleField;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fsr19
 */
public class Player {
    private final String name;
    
    private Field currentField;
    
    private final Field[] map;
    
    private List<OwnebleField> ownedFields = new ArrayList<>();
    
    private int money = MonopolyConstants.START_MONEY;
    
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
    
    public boolean buyField(OwnebleField field) {
        DeedCard card = field.getDeedCard();
        if (card != null && money >= card.getPrice()) {
            ownedFields.add(field);
            removeMoney(card.getPrice());
            return true;
        }
        return false;
    }
    
    
    public void addMoney(int amount) {
        money += amount;
    }
    
    public void removeMoney(int amount) {
        money -= amount;
    }
    
    public boolean ownesField(OwnebleField field) {
        return ownedFields.contains(field);
    }
}
