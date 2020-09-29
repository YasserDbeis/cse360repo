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
	
	/**
	 * Adding Machine has a default constructor setting total instance variable to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
  
	/**
	 * getTotal is a method that returns the total instance variable (currently set to 0 in this code)
	 * @return
	 */
	public int getTotal () {
		return 0;
	}
  
	/**
	 * add is a void method that add's a parameterized input to the total instance variable
	 * @param value
	 */
	public void add (int value) {
  
	}

	/**
	 * substract is a void method that subtracts a parameterized input from the total instance variable
	 */
	public void subtract (int value) {
  
	}

	/**
	 * toString returns the total in string format
	 */
	public String toString () {
		return "";
	}

	/**
	 * clear clears the value of total
	 */
	public void clear() {
  
	}
}