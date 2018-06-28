/**
 * 
 * @author JustinCommins
 *Write the following code in your editor below:

A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.

Your classes should not be be .

Input Format

You are not responsible for reading any input from stdin; 
a locked code stub will test your submission by calling the add method on an Adder object and passing it integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20

 */

class Arithmetic{ //**private or public class does not work** 
	
	int add(int n1, int n2){
		
		int result = (n1 + n2); 
		return result; 
		//can also put just return (n1 + n2); 
	}

}

class Adder extends Arithmetic{ //**private or public class does not work**
	
	Adder(){ //constructor --> public Adder works also //will not work without this constructor method
		
		System.out.println("My superclass is: Arithmetic"); 
		
	}
}

public class Inheritance_2 {
		
	public static void main(String[] args) {

		Adder a = new Adder(); 
		
		// Print the name of the superclass on a new line
		//System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
	
		// Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
		System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
		}
}


