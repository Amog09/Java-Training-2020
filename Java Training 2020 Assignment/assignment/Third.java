package tasktwo.assignment;

public class Third {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		int avg = (a + b + c) / 3;
		System.out.println("Average = " + avg);

		if ((avg > a) & (avg > b) & (avg > c)) {
			System.out.println("Average is highr than a , b , c : " + a + " " + b + " " + c);

		} else if ((avg > a) & (avg > b)) {
			System.out.println("Average is higher than a , b , c : " + a + " " + b + " " + c);
			
		} else if ((avg > a) & (avg > c)) {
			System.out.println("Average is higher than a and c: " + a + " " + c);
			
		} else if ((avg > b) & (avg > c)) {
			System.out.println("Average is higher than b and c: " + b + " " + c);
			
		} else if (avg > a) {
			System.out.println("Average is higher than a: " + a);
			
		} else if (avg > b) {
			System.out.println("Average is higher than b: " + b);
			
		} else if (avg > c) {
			System.out.println("Average is higher than c: " + c);
			
		}
	}

}
