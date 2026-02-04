package java_coding_string;

import java.util.stream.Collectors;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		String str = "Programming";
		String result = str.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(result);

	}

}
