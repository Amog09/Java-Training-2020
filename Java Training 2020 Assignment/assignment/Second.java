package tasktwo.assignment;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int first1 = 0;
		int second2 = 0;
		String five = "5";
		System.out.println("Select the type of calculation. ");
		System.out.println(" 1: Addition \n 2: substraction \n 3: Division \n 4: Multiplication \n 5: Average");

		String command = scan.next();

		System.out.println("Enter first number..");
		int first = scan.nextInt();
		System.out.println("Enter second number..");
		int second = scan.nextInt();
		scan.close();
		if (command.equals(five)) {
			System.out.println("Enter third number..");
			first1 = scan.nextInt();
			System.out.println("Enter fourth number..");
			second2 = scan.nextInt();

		}

		switch (command) {

		case "1":
			int result = first + second;
			System.out.println("The result of your selection is: " + result);
			if (result < 0) {
				System.out.println("Opps! your option" + command + " is returning negetive number.");
			}
			break;
		case "2":
			result = first - second;
			System.out.println("The result of your selection is: " + result);
			if (result < 0) {
				System.out.println("Opps! your option " + command + " is returning negetive number.");
			}
			break;
		case "3":
			result = first / second;
			System.out.println("The result of your selection is: " + result);
			if (result < 0) {
				System.out.println("Opps! your option " + command + " is returning negetive number.");
			}
			break;
		case "4":
			result = first * second;
			System.out.println("The result of your selection is: " + result);
			if (result < 0) {
				System.out.println("Opps! your option " + command + " is returning negetive number.");
			}
			break;
		case "5":
			float result2 = (first + second + first1 + second2) / 4;
			System.out.printf("The result of your selection is: %f", result2);
			if (result2 < 0) {
				System.out.println("Opps! your option " + command + " is returning negetive number.");
			}
			break;
		default:
			System.out.println("Command not recognized.");
		}

	}

}
