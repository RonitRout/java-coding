package java_coding_logical;

import java.util.Scanner;

public class PrintFactros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The factors of  " + num + "are");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

}
