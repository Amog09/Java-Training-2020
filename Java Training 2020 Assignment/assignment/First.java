package tasktwo.assignment;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number.");
		int value = scan.nextInt();

		if ((value % 3 == 0) & (value % 5 != 0)) {
			System.out.println("Consultadd");
		}
		if ((value % 5 == 0) & (value % 3 != 0)) {
			System.out.println("Java Traning");
		}
		if ((value % 3 == 0) & (value % 5 == 0)) {
			System.out.println("Consultadd Java Traning");

		}

	}

}
