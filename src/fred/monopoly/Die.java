/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

import java.util.Random;

/**
 *
 * @author fsr19
 */
public class Die {
    private int numberOfFaces = 6;
    private int lastThrow = 0;
    private Random random;
    
    public Die() {
        random = new Random();
        random.nextInt();
    }
    
    public Die(int numberOfFaces) {
        this();
        this.numberOfFaces = numberOfFaces;
    }
    
    public int throwDie() {
        lastThrow = random.nextInt(numberOfFaces) + 1;
        return lastThrow;
    }
    
    public int getLastThrow() {
        return lastThrow;
    }
    
}
