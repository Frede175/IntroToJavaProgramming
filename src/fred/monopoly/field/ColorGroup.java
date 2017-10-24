/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.field;

/**
 *
 * @author fsr19
 */
public enum ColorGroup {
    BROWN(2), LIGHT_BLUE(3), PURPLE(3), ORANGE(3), RED(3), YELLOW(3), GREEN(3), BLUE(2);
    
    private final int numberOfPropertiesInGroup;
    
    private ColorGroup(int numberOfPropertiesInGroup) {
        this.numberOfPropertiesInGroup = numberOfPropertiesInGroup;
    }
    
    public int getNumberOfPropertiesInGroup() {
        return numberOfPropertiesInGroup;
    }
    
    public static ColorGroup getFromMapIndex(int i) {
        switch (i) {
            case 1:
            case 3:
                return BROWN;
            case 6:
            case 8:
            case 9:
                return LIGHT_BLUE;
            case 11:
            case 13:
            case 14:
                return PURPLE;
            case 16:
            case 18:
            case 19:
                return ORANGE;
            case 21:
            case 23:
            case 24:
                return RED;
            case 26:
            case 27:
            case 29:
                return YELLOW;
            case 31:
            case 32:
            case 34:
                return GREEN;
            case 37:
            case 39:
                return BLUE;
        }
        return null;
    }
}
