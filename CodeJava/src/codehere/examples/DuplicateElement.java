package codehere.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Program to remove duplicates from a List in Java 8
public class DuplicateElement {

	public static void main(String[] args) {
		// input list with duplicates
		List<Integer> list1 = new ArrayList<>(
				Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		System.out.println("Array with duplicate element:- " +list1);
		// Construct a new list from the set constructed from elements
        // of the original list
		List<Integer> newList = list1.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println("Array without duplicate element:- " +newList);
		
		// you can also perform this with Set
		Set<Integer> setElement = new HashSet<>();
		list1.stream().filter(x -> setElement.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
		
		//Using limit() f limiting the nth elements in stream
		list1.stream().limit(5).forEach(x->System.out.println(x));
		
		//Using skip() for skipping first the nth elements in stream
		list1.stream().skip(5).forEach(x->System.out.println(x));
	}

}
