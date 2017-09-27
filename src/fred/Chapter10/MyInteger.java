/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter10;

/*
    This is a failed since we were not meant to make this task (10.03)


*/


/**
 *
 * @author fsr19
 */
public class MyInteger {
	private int value;
	 
	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);		
	}

	public boolean isPrime() {
		return isEven(value);		
	}


	public boolean equals(int value) {
		return (this.value == value);
	}

	public boolean equals(MyInteger value) {
		return (this.value == value.getValue());
	}



	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
		if (value <= 0) return false;
		if (value == 1 || value == 2) return true;

		int to = (int)Math.ceil(Math.sqrt(value));

		for (int i = 3; i <= to; i++) {
			if (value % i == 0) return false;			
		}
		return true;
	}
        
	public static boolean isEven(MyInteger value) {
		return isEven(value.getValue());
	}

	public static boolean isOdd(MyInteger value) {
		return isOdd(value.getValue());
	}

	public static boolean isPrime(MyInteger value) {
		return isPrime(value.getValue());
	}

	public static MyInteger parseInt(char[] c) {
		return new MyInteger(Integer.parseInt(new String(c)));
	}	

	public static MyInteger parseInt(String s) {
		return new MyInteger(Integer.parseInt(s));
	}
}
