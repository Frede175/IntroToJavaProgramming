/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fsr19
 */
public class Dice {
    private final int numberOfDices;
    Die[] dice;
    
    public Dice(int numberOfDices) {
        this.numberOfDices = numberOfDices;
        dice = new Die[numberOfDices];
        
        for (int i = 0; i < numberOfDices; i++) {
            dice[i] = new Die();
        }
    }
    
    
    public int throwDice() {
        int sum = 0;
        for (Die die : dice) {
            sum += die.throwDie();
        }
        return sum;
    }
    
    public boolean twoEqual() {
        Map<Integer, Integer> count = new HashMap<>();
        for (Die die : dice) {
            if (count.getOrDefault(die.getLastThrow(), 0) == 1) return true;
            else count.put(count.get(die.getLastThrow()), 1);
        }
        return false;
    }
    
    public boolean allEqual() {
        for (int i = 1; i < numberOfDices; i++) {
            if (dice[0].getLastThrow() != dice[i].getLastThrow()) return false;
        }
        return true;
    }
    
}
