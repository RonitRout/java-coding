package java_coding_logical;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println("is a prime number");
		} else {
			System.out.println("is not a prime number");
		}

	}

}
