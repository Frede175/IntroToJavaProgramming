package fred;

import fred.Chapter19.Helpers;
import fred.monopoly.Start;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fsr19
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000];
        
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(numbers.length);
        }
        
        Arrays.sort(numbers);
        
        System.out.println(Helpers.binarySearch(numbers, 999) + "");
        
    }
    
}
