package codehere.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// program will count occurrence of no. of words in given string.
public class CountOccurreOfWord {

	public static void main(String[] args) {
		
		String str = "Welcome to code decode and code decode welcome you ha ha ha";
		// convert the str to list of stream to have each word separately
		List<String> list1 = Arrays.asList(str.split(" "));
		//open a stream and collect in map to get the words and occurrence
		Map<String, Long> resultMap = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(resultMap);
	}
}
