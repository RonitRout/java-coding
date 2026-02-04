package java_coding_java8_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesElements {

	public static void main(String[] args) {
		String s[] = { "abc", "abc", "xyz" , "abc", "xyz" };
		Set<String> set = new HashSet<>();

		Set<String> dulicates = Arrays.stream(s).filter(i -> !set.add(i)).collect(Collectors.toSet());
		System.out.println(dulicates);

	}

}
