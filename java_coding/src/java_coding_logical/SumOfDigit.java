package java_coding_logical;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int mul = 1;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i > 0; i = i / 10) {
			sum = sum + (i % 10);
			mul = mul * (i % 10);
		}
		System.out.println(sum);
		System.out.println(mul);

	}

}
