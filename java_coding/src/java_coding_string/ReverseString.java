package java_coding_string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello i will fuck in your @SS";

		String reversed = str.chars().mapToObj(c -> (char) c)
				.filter(c -> (Character.isLowerCase(c) || Character.isDigit(c)) && !Character.isWhitespace(c))
				// skip spaces,Ignore case sensitive and skip special character
				.reduce("", (a, b) -> b + a, String::concat);
		System.out.println(reversed);
	}

}
