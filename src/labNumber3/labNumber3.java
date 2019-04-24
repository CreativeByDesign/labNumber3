package labNumber3;

import java.util.Scanner;

public class labNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a numeric value between 1-100: ");
		int num = scan.nextInt();

		if (num > 100) {
			System.out.println("Number can not be found. Please enter another number.");

		} else if (num % 2 == 0 && num < 25 && num != 0) {
			System.out.println("Even and less than 25");

		} else if (num % 2 == 0 && num < 60 && num != 0) {
			System.out.println("Even");
		} else if (num % 2 == 0 && num > 60) {
			System.out.println(num + " : Even");

		} else if (num % 2 != 0 && num > 60) {
			System.out.println(num + " : Odd and over 60");
		}

		else if (num % 2 != 0 && num != 0) {
			System.out.println(num + " : Odd");
		}

		else {
			System.out.println("Invalid number entered");
		}

		scan.close();
	}

}
