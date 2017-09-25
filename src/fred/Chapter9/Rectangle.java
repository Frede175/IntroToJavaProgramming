/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter9;

/**
 *
 * @author fsr19
 */
public class Rectangle {
    private double width, height;
    
    public Rectangle() {
        width = 1;
        height = 1;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
}
