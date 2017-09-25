/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter9;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author fsr19
 */
public class Chapter9 {
    public void task_01() {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Width: " + rect1.getWidth() + ", height: " + rect1.getHeight() + ", area: " + rect1.getArea() + ", perimeter: " + rect1.getPerimeter());
        System.out.println("Width: " + rect2.getWidth() + ", height: " + rect2.getHeight() + ", area: " + rect2.getArea() + ", perimeter: " + rect2.getPerimeter());
    }
    
    private void displayCalendar(GregorianCalendar cal) {
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR) + ", month: " + cal.get(GregorianCalendar.MONTH) + ", day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
    public void task_05() {
        GregorianCalendar cal = new GregorianCalendar();
        displayCalendar(cal);
        
        cal.setTimeInMillis(1234567898765L);
        displayCalendar(cal);
    }
    
    public void task_07() {
        Account acc = new Account(1122, 20000, 4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        
        System.out.println("Balance:" + acc.getBalance());
        System.out.println("Monthly interest: " + acc.getMonthlyInterest());
        System.out.println("Date created: " + acc.getDateCreated());
    }
    
    public void task_10() {
        QuadraticEquation eq = new QuadraticEquation(1, 1, 1);
        
        if (eq.getDiscriminant() < 0) System.out.println("The equation has no roots");
        else if (eq.getDiscriminant() == 0) System.out.println("The equation has one root: " + eq.getRoot1());
        else System.out.println("The equation has two roots: " + eq.getRoot1() + ", " + eq.getRoot2());
        
    }
    
    public void task_13() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        System.out.println("Enter the array");
        
        double[][] a = new double[rows][cols];
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        Location loc = Location.locateSmallest(a);
        System.out.println("The location of the smallest element is " + loc.minValue + " at (" + loc.row + ", " + loc.column + ")");
        
        
    }
}
