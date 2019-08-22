/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
//uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		double g=9.8;
		Scanner obj=new Scanner(System.in);
		double time=obj.nextFloat();
        System.out.print("The speed of the object at"+time);
        double speed=(g*time);
		System.out.println("seconds after its release is"+speed);
		double distance =(1.0/2.0)*(g*time*time);
		System.out.print("and the distance the object has travelled in the"+time);
		System.out.print("seconds after the release is"+distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
