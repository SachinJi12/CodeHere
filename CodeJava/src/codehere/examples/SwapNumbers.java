package codehere.examples;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a is- " +a+ "and b is- " +b);
		
		//rule for swaping numbers without third variable
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("After swapping a is- " +a+ "and b is- " +b);
		
	}

}
