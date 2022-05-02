package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.brackets.BalancedBrackets;

public class Main_Brackets {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine(); // reads string
		System.out.print("You have entered: " + str);
		System.out.println("\n");

		// Function call
		if (BalancedBrackets.areBracketsBalanced(str))

			System.out.println(" The entered String has Balanced Brackets ");
		else
			System.out.println(" The entered Strings do not contain Balanced Brackets ");
		sc.close();
	}

}
