package labNumber17;


import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String enter;
		
		System.out.println(
				"Thank you for using the Prime Locator App!\nThis app finds any prime number, from the first prime number onwards.");
		do {
			int userNum = Validator.getInt(key,
					"Which prime do you want to find today?\n(enter in a number to find the prime): ");

			System.out.println("Prime number " + userNum + " is " + checkPrime(userNum) + ".");

			enter = Validator.getContinue(key, "Do you want to look for another prime? (Yes/No): ");
		} while (enter.equalsIgnoreCase("Yes"));

		System.out.println("Thank you for using the Prime Locator App! Goodbye!");

	}

	public static int checkPrime(int n) {
		int num, count, i;
		num = 1; 
		count = 0;
		
		while (count < n) {
			num++;
			for (i = 2; i <= num; i++) {
				if  (num % i== 0) {
					break;
				} 
			}
			if (i == num) {
				count++;
			}
		}
		
		return num;

	}

}
