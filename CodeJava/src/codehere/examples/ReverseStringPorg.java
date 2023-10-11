package codehere.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringPorg {

	public static void main(String[] args) {
		//String str = "1234567";
		String str="abcd.efg.qwerty";
		System.out.println(reverse(str));

	}
	private static String reverse(String in) {
		if(in == null) {
			throw new IllegalArgumentException("Null is not allowed");
	}
		// directly from StringBuilder
		//String reversed = new StringBuilder(in).reverse().toString();
		
		/*
		 * StringBuilder out = new StringBuilder();
		 * char[] chars = in.toCharArray(); for (int i = chars.length - 1; i >= 0; i--)
		 * { out.append(chars[i]); }
		 */
		
		// Through Java 8 Lambda/stream
		// you can also use split.("[.]")
		String reversed = Arrays.asList(in.split("\\.")).stream().map(m -> new 
		StringBuilder(m).reverse().toString()).collect(Collectors.joining("."));

		return reversed.toString();
			
	}
}
