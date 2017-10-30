/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fsr19
 */
public class Command {
    
    private static Scanner scanner = new Scanner(System.in);
    
    private Command() {}
    
    
    public static String getCommand(String question, List<String> options) {
        System.out.print(question);
        
        String input;
        
        while (!options.contains((input = scanner.nextLine()))) {
            System.out.println("That is not an option.");
            System.out.print(question);
        }
        
        return input;
    }
    
    public static int getNumber(String question, int min, int max) {
        System.out.print(question + " (" + min + " , " + max + "): ");
        
        int input = 0;
        
        boolean valid = false;
        
        do {
            try {
                input = scanner.nextInt();
                valid = true;
            } catch (NumberFormatException ex) {
                System.out.println("That is not valid!");
                System.out.print(question + " (" + min + " , " + max + "): ");
            }
            
        } while (!valid && input < min && input > max);
        
        
        return input;
    }
    
}
