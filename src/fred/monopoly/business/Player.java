/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business;

import fred.monopoly.business.card.deed.DeedCard;
import fred.monopoly.business.field.ColorGroup;
import fred.monopoly.business.field.Field;
import fred.monopoly.business.field.OwnebleField;
import fred.monopoly.business.field.PropertyField;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fsr19
 */
public class Player {
    private final String name;
    
    private boolean inJail = false;
    
    private int currentField;
    
    private final Field[] map;
    
    private List<OwnebleField> ownedFields = new ArrayList<>();
    
    private int money = MonopolyConstants.START_MONEY;
    
    public Player(String name, int startField, Field[] map) {
        this.name = name;
        currentField = startField;
        this.map = map;
    }
    
    public String getName() {
        return name;
    }

    public int getCurrentField() {
        return currentField;
    }
    
    public void move(Dice die) {
        int t = die.throwDice();
        System.out.println("You threw: " + t);
        
        currentField = (currentField + t) % 40;
        
        System.out.println("You landed on " + map[currentField].getName());
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
    
    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }
    
    public boolean ownesField(OwnebleField field) {
        return ownedFields.contains(field);
    }
    
    public boolean ownsAllPropertiesInColorGroup(ColorGroup color) {
        int count = 0;
        for (OwnebleField field : ownedFields) {
            if (field instanceof PropertyField) {
                PropertyField f = (PropertyField) field;
                if (f.getColorGroup() == color) count++;
            }
        }
        return count == color.getNumberOfPropertiesInGroup();
    }
    
    public int getMoney() {
        return money;
    }

    public void setPos(int mapPos) {
        currentField = mapPos;
        System.out.println("You landed on " + map[currentField].getName());
        //map[currentField].consequense(this);
    }
}
