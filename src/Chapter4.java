
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fsr19
 */
public class Chapter4 {
    public void task_01(double r) {
        double answer = (5 * (2*r*Math.sin(Math.PI/5))*(2*r*Math.sin(Math.PI/5))) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("Answer is: %.2f \n", answer);
    }
    
    public void task_23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double numberOfHoursInWeek = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();
        
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + numberOfHoursInWeek);
        System.out.println("Pay rate: $" + hourlyPayRate);
        System.out.println("Gross pay: $" + (numberOfHoursInWeek * hourlyPayRate));
        System.out.println("Deductions: ");
        System.out.printf("\tFederal withholding (%2.1f): $%.2f \n", federalTax * 100, (numberOfHoursInWeek * hourlyPayRate) * federalTax);
        System.out.printf("\tState withholding (%2.1f): $%.2f\n", stateTax * 100, (numberOfHoursInWeek * hourlyPayRate) * stateTax);
        System.out.printf("\tTotal Deductio: $%.2f\n", ((numberOfHoursInWeek * hourlyPayRate) * stateTax + (numberOfHoursInWeek * hourlyPayRate) * federalTax));
        System.out.printf("Net pay: $%.2f \n", ((numberOfHoursInWeek * hourlyPayRate) - ((numberOfHoursInWeek * hourlyPayRate) * stateTax + (numberOfHoursInWeek * hourlyPayRate) * federalTax)));
    }
}
