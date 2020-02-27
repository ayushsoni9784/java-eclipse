package lesson2;
/*
 This java program is for the getting user input
 */
import java.util.Scanner;

public class lesson2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For integer
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some no.");
		int user_input = scan.nextInt();
		System.out.println("Entered no. is" +user_input);

		// For Double
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal no.");
		double user_double = scan.nextDouble();
		System.out.println("Entered no. is" +user_double);
		
		// For text input
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some string");
		String user_string = scan.nextLine();
		System.out.println("Entered string is" +user_string);
		 
	}

}
 