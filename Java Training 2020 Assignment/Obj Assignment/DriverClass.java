package com.prac.core.traning.java;

import java.util.Scanner;

import com.prac.core.traning.option.OptionManager;
import com.prac.traning.java.Rectangle;

public class DriverClass {

	public static void main(String[] args) {
		OptionManager optMng = new OptionManager();
		System.out.println("\tMain Program");
		System.out.println("   Creating a Rectangle. \n   Displaying Rectangle. \n   Print total area\n");

		System.out.println("Select an option to start the program.\n");
		System.out.println("1. Enter value. \n2. Default value");

		Scanner optm = new Scanner(System.in);
		String value = optm.nextLine();
		int input = 0;
		switch (value) {
		case "1":
			System.out.println("Option 1 selected");
			Rectangle rec = optMng.createRectangle();
			optMng.showRectangle(rec);

			System.out.println("\t Advance Option:");
			System.out.println("1: Create next rectrangle \n2: Exit program");
			input = optm.nextInt();
			while (input == 1) {
				Rectangle rec1 = optMng.createRectangle();
				optMng.showRectangle(rec);
				System.out.println("\n\t Advance Option:");
				System.out.println("1: Create next rectrangle \n2: Exit program");
				input = optm.nextInt();
				if (input == 1) {
					System.out.println("Option 1 is sected");
				}
			}

			break;

		case "2":
			System.out.println("Option 2 is selected.");
			System.out.println("Calculating default value.");
			Rectangle rec2 = optMng.defaultRecValue();

			System.out.println("\t Advance Option:");
			System.out.println("1: Create next rectrangle \n2: Exit program");

			input = optm.nextInt();
			if (input == 1) {
				System.out.println("Option 1 is selectd");
			} else {
				System.out.println("Exiting program");
			}
			while (input == 1) {
				System.out.println("     Choose the following option");
				System.out.println("1. Enter value. \n2. Default value");
				input = optm.nextInt();
				if (input == 1) {
					Rectangle rec3 = optMng.createRectangle();
					optMng.showRectangle(rec3);
					System.out.println("\n\t Advance Option:");
					System.out.println("1: Create next rectrangle \n2: Exit program");
					input = optm.nextInt();
					if (input == 1) {
						System.out.println("Option 1 is selected");
					}
				}
				
					while(input ==2) {
					System.out.println("Option 2 is selected.");
					System.out.println("Calculating default value.");
					Rectangle rec4 = optMng.defaultRecValue();
					System.out.println("     Choose the following option");
					System.out.println("1. Enter value. \n2. Default value \n3. Exit Program");
					input = optm.nextInt();
					}
				
			}

		

			/*
			 * if (input == 1) { System.out.println("Option 1 is selected."); Rectangle rec3
			 * = optMng.createRectangle(); optMng.showRectangle(rec3);
			 * 
			 * }else { System.out.println("Option 2 is selected.");
			 * System.out.println("Calculating default value."); OptionManager optMng3 = new
			 * OptionManager(); Rectangle rec4 = optMng3.defaultRecValue(); }
			 */

		}
	}

}
