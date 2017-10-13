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
public class Field {
    private final String name;
    
    private final int number;
    
    public Field(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
