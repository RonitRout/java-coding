package java_coding_logical;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial of " + num + " is " + fact);

	}

}
