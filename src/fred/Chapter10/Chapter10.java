/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter10;

/**
 *
 * @author fsr19
 */
public class Chapter10 {
    public void task_04() {
        MyPoint start = new MyPoint();
        MyPoint end = new MyPoint(10, 30.5);
        
        System.out.println("Distance: " + start.distance(end));
        
    }
    
    public void task_13() {
        MyRectangle2D rect = new MyRectangle2D(3, 2, 6.5, 5.9);
        
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        
        System.out.println("Rect contains 4, 4: " + rect.contains(4, 4));
        
        System.out.println("Rect contains new MyRectangle2D(5, 6, 11.5, 4.2): " + rect.contains(new MyRectangle2D(5, 6, 11.5, 4.2)));
        
        System.out.println("Rect overlaps new MyRectangle2D(4, 6, 3.3, 6.4): " + rect.overlaps(new MyRectangle2D(6,5,5,10)));
    }
}
