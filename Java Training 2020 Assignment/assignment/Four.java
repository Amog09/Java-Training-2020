package tasktwo.assignment;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int value;

		do {
			System.out.println("Enter any number...");
			value = scan.nextInt();
			System.out.println("Good going.");
		} while (value > 0);

		System.out.println("Its Ovre.");

	}

}
