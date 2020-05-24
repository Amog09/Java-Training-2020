package tasktwo.assignment;


public class SwapVariables2 {

	public static void main(String[] args) {
		
		int firstNum = 10;
		int secNum = 20;
		
		firstNum = firstNum + secNum;
		secNum = firstNum - secNum;
		firstNum =  firstNum - secNum ;
		System.out.println("First Number: " +firstNum + " " + "\nSecond Number : "+secNum);
		
	

	}
	

}
