/**
 * Reverse a String
 * 
 * Write a program to:
 * 	1. Take String Input
 * 	2. Convert it into char array, which contains letters of the string as its elements
 * 
 * Sample Input:
 * 		hello there
 * 
 * Sample Output:
 * 		ereht olleh
 * 
 * Hint:
 * 	loop through the char array, starting from the end, using arr.length
 * 	to get the size of the array
 *  use toCharArray() function to convert string to Array
 */

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String str= scan.nextLine();
		char[] chArr= str.toCharArray();
		
		int chLength=chArr.length-1;
		System.out.println("Length of Array: "+chLength);
		
		System.out.print("Reverse of String: ");
		do {
			System.out.print(chArr[chLength]);
			chLength--;
		} while (chLength>=0);
		
	}

}
