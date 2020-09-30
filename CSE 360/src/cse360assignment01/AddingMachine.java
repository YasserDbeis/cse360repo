package cse360assignment01;

/**
 * 
 * @author Yasser Dbeis
 * class:  CSE 360
 * class description: This class represents a machine that can do add and subtract
 * operations, as well as keeping the state of the value. The user can also call
 * a function to obtain a string formatted version of the computation. 
 */
public class AddingMachine {
	private int total;
	private String receipt;
	
	/**
	 * Adding Machine has a default constructor setting total instance variable to 0 and receipt to "0"
	 */
	public AddingMachine () {
		total = 0; 
		receipt = "0";
	}
  
	/**
	 * getTotal is a method that returns the total instance variable 
	 */
	public int getTotal () {
		return total;
	}
  
	/**
	 * add is a void method that add's a parameterized input to the total instance variable
	 */
	public void add (int value) {
		total += value;
		receipt += " + " + value;
	}

	/**
	 * subtract is a void method that subtracts a parameterized input from the total instance variable
	 */
	public void subtract (int value) {
		total -= value;
		receipt += " - " + value;
	}

	/**
	 * toString returns the total in string format
	 */
	public String toString () {
		return receipt;
	}

	/**
	 * clear clears the value of total
	 */
	public void clear() {
		total = 0;
		receipt = "0";
	}
}

/**\
 * TestAddingMachine is a test class with a main method to test the AddingMachine class
 */

class TestAddingMachine {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
		myCalculator.clear();
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
	}
}