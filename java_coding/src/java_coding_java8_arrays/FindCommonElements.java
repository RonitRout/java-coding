package java_coding_java8_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 3, 4, 5, 6, 7 };
		List<Integer> commonElements = Arrays.stream(a1).filter(num -> Arrays.stream(a2).anyMatch(num1 -> num1 == num))
				.boxed().collect(Collectors.toList());
		System.out.println("Common elements :" + commonElements);
	}

}
