
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
public class Chapter6 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
    
    
    public void task_07() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount invested: ");
        int invested = scanner.nextInt();
        System.out.print("Annual interest rate: ");
        int interestRate = scanner.nextInt();
        
        System.out.println("Years \t Future Value");
        
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%2d \t %10.2f \n", i, futureInvestmentValue(invested, interestRate/12.0 / 100.0, i));
        }
        scanner.close();
    }
    
    
    /** Convert from Mile to Kilometer */
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }
    
    
    /** Convert from Kilometer to Mile */
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }
    
    
    public void task_08() {
        System.out.println("Miles \t Kilometers \t | \t Kilometers \t Miles");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d \t %8.3f \t | \t %2d \t\t %8.3f \n", i + 1, mileToKilometer(i + 1), (i*5) + 20, kilometerToMile((i * 5) + 20));
        }
    }
    
    private boolean checkPassword(String password) {
        return (password.length() >= 10 && password.matches("([A-z0-9])\\w+"));
    }
    
    public void task_18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a passowrd: ");
        String password = scanner.nextLine();
        
        if (checkPassword(password)) System.out.println("Valid");
        else System.out.println("Invalid");
                
                
        scanner.close();
    }
    
    
    /** Return true if the card number is valid
     * @param number card number to be checked if valid
     * @return if the card value is valid
     */
    public static boolean isValid(long number) {
        return ((prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) && 
               ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 ));
    }
    
    /** Get the result from Step 2
     * @param number card number
     * @return the sum of the even placed digits * 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int i = 1;
        while (number != 0) {
            if (i % 2 == 0) sum += getDigit((int)(number % 10 * 2));
            number /= 10;
            i++;
        }
        return sum;
    }
    
    /** Return this number if it is a single digit, otherwise,
    * return the sum of the two digits */
    public static int getDigit(int number) {
        if (getSize(number) == 1) return number;
        else return number / 10 + number % 10;
    }
    
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        int i = 1;
        while (number != 0) {
            if (i % 2 == 1) sum += number % 10;
            number /= 10;
            i++;
        }
        return sum;
    }
    
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        int size = getSize(d);
        long prefix = getPrefix(number, size);
        
        return prefix == d;
    }
    
    /** Return the number of digits in d */
    public static int getSize(long d) {
        if (d == 0) return 1;
        return (int)(Math.floor (Math.log10 (Math.abs (d))) + 1);
    }
    
    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size < k) return number;
        
        while (size != k) {
            number /= 10;
            size--;
        }
        return number;
    }
    
    
    
    public void task_31() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a card number: ");
        long n = scanner.nextLong();
        if (isValid(n)) System.out.println("Card number is valid");
        else System.out.println("Card number is invalid");
                
        scanner.close();
    }
    
    
    
    public static double area(int n, double side) {
        return (n * side*side) / (4 * Math.tan(Math.PI / n));
    }
    
    public void task_36() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        
        System.out.println("The area of the polygon is: " + area(n, side));
                
        scanner.close();
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    
    
    public void task_40() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) System.out.println("Leap year");
        else System.out.println("Not leap year");
                
        scanner.close();
    }
}
