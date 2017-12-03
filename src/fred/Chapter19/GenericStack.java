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
public class GenericStack<T> extends ArrayList<T> {
    
    public boolean put(T item) {
        return add(item);
    }
    
    public T peak() {
        if (isEmpty()) return null;
        return get(size() - 1);
    }
    
    public T take() {
        if (isEmpty()) return null;
        return remove(size() - 1);
    }
    
}
