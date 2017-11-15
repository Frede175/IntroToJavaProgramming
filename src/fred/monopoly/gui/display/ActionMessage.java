/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.gui.display;

/**
 *
 * @author fsr19
 */
public class ActionMessage {
    private String name;
    private String message;
    
    public ActionMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }
    
    @Override
    public String toString() {
        return String.format("%-35s %s", name, message);
    }
}
