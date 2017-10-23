/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter21;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fsr19
 */
public class Chapter21 {
    
    
    
    public void Task_6() {
        
        System.out.println(ItemName.BLOODBAG);
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        
        System.out.println("Please enter some numbers: ");
        
        while ((number = scanner.nextInt()) != 0) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
        
        int highestCount = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > highestCount) {
                numbers.clear();
                highestCount = entry.getValue();
                numbers.add(entry.getKey());
            } else if (entry.getValue() == highestCount) {
                numbers.add(entry.getKey());
            }
        }
        
        System.out.print("The number(s) that occurrenced must was ");
        
        for (Integer n : numbers) {
            System.out.print(n + ", ");
        }
        System.out.println("and ccurrenced " + highestCount + " times");
        scanner.close();
    }
    
    public void Task_11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loading text files!");
        
        Map<String, Integer>[][] names = null;
        
        
        try {
            names = createNameArrays(2001);
        } catch (IOException ex) {
            Logger.getLogger(Chapter21.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (names == null) return;
        
        System.out.println("Loaded");
        
        System.out.print("Select gender (0: boys and 1: girls): ");
        
        int gender = scanner.nextInt();
        
        System.out.print("Please selct year (2001-2010): ");
        
        int year = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Please enter name: ");
        
        String name = scanner.nextLine();
        
        Integer rank = names[gender][year - 2001].get(name);
        
        if (rank != null) {
            System.out.println(name + " has a ranking of " + rank);
        } else {
            System.out.println(name + " was not found in the list!");
        }
        
        scanner.close();
    }
    
    private Map<String, Integer>[][] createNameArrays(int startYear) throws IOException {
        String baseURL = "http://www.cs.armstrong.edu/liang/data/babynamesranking";
        
        Map<String, Integer>[][] array = new HashMap[2][10];
        
        
        for (int i = startYear; i < startYear + 10; i++) {
            URL url = new URL(baseURL + i + ".txt");
            Scanner s = new Scanner(url.openStream());
            
            array[0][i - startYear] = new HashMap<>();
            array[1][i - startYear] = new HashMap<>();
            
            while (s.hasNext()) {
                int rank = Integer.parseInt(s.next());
                
                array[0][i - startYear].put(s.next(), rank);
                s.next();
                array[1][i - startYear].put(s.next(), rank);
                s.next();
            }
            
            s.close();
        }
        
        
        return array;
        
    }
}


enum ItemName {
    BLOODBAG("Blood bag");
    
    private String name;
    
    private ItemName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}