package codehere.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeStream {

	public static void main(String[] args) {
		List<Integer> arlist = new ArrayList<Integer>();
		
		arlist.add(15);
		arlist.add(20);
		arlist.add(35);
		arlist.add(47);
		
		//get a Stream Object
		Stream<Integer> openStream = arlist.stream();
		
		// Configure stream by FILTER()
		Stream<Integer> filteredStrem = openStream.filter(i -> i >=20);
		
		/*
		 * //Count elements in stream with COUNT() long newFilterdListCount =
		 * filteredStrem.count(); System.out.println(newFilterdListCount);
		 */
		
		//process the Stream with COLLECT()
		List<Integer> newFilteredList = filteredStrem.collect(Collectors.toList());
		
		//Execute the Stream output
		newFilteredList.stream().forEach(x -> System.out.println(x));
		
		//Now writing in Single line
		System.out.println("Now writing in Single line");
		List<Integer> newFilyerdList = arlist.stream().filter(i -> i >=15).collect(Collectors.toList());
		newFilyerdList.forEach(x -> System.out.println(x));
		
		//Now writing in Single line to Count elements in stream with COUNT()
		System.out.println("Now writing in Single line to Count elements in stream");
		long newFilyerdListCount = arlist.stream().filter(i -> i >=15).count();
		System.out.println(newFilyerdListCount);
		
		// Sorting the List by default ascending by SORTED()
		System.out.println("Sorting a steram list in asending order");
		Stream<Integer> newFilterSorted = arlist.stream().filter(i -> i >= 15).sorted();
		newFilterSorted.forEach(x -> System.out.println(x));
		
		// Sorting in Descending order using Comparator by compareTo()
		System.out.println("Sorting a steram list in Descending order");
		Stream<Integer> newFilterSortedDesending = arlist.stream().filter(i -> i >= 15).sorted((i1, i2) -> i2.compareTo(i1));
		// forEach loop can only be used with returning stream with lambda expression
		newFilterSortedDesending.forEach(x -> System.out.println(x));
		
		// To get the min/max from list
		Integer minValue = arlist.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Value:-" +minValue);
		Integer maxValue = arlist.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum Value:-" +maxValue);
		
		// Converting the Stream back o Array by toArray() that returns array object
		Object[] copySreamToArray = arlist.stream().filter(i -> i >= 20).toArray();
		// to print the array we just need normal for loop
		for(Object obj: copySreamToArray) {
			System.out.println("Elements in Array:- "+obj);
		}
		
		// Use of Of() when you convert group of values to be converted on stream
		Stream.of(1,11,111,11111,111).forEach(x -> System.out.println(x));
		//OR
		String[] name = {"code", "decode", "somecode", "ncode"};
		Stream.of(name).filter(x -> x.length() > 3).forEach(x -> System.out.println(x));
		
		// Use of reduce() for getting single element  from Stream 
		// also can check with peek() till there what's in stream 
		System.out.println( arlist.stream().peek(System.out:: println).reduce((a, b) -> a+b).get());
	}

}
