package tasktwo.assignment;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value.");
		String value = scan.nextLine();
		System.out.println("You have entered : " +value);
			
		System.out.println(" Please enter first number..");
		int firstNum =  scan.nextInt();
		System.out.println("Please enter second number..");
		int secondNum = scan.nextInt();
		int z = firstNum + secondNum;
		z = z +30;
		scan.close();
				
		System.out.println(" The sum of the number entered is : " + z);
	}

}
