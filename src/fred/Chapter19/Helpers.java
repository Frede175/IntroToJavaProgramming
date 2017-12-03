/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter19;

import java.util.ArrayList;

/**
 *
 * @author fsr19
 */
public class Helpers {
    
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E item : list) {
            if (!newList.contains(item)) newList.add(item);
        }
        return newList;
    }
    
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) return i;
        }
        return -1;
    }
    
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        if (list.length == 0) return -1;
        
        int low = 0;
        int high = list.length - 1;
        int mid;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (list[mid].compareTo(key) == 0) return mid;
            
            if (list[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
