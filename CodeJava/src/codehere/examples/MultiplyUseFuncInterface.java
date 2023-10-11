package codehere.examples;

//Program to multiply the element using functional interface(FuctIterface)

public class MultiplyUseFuncInterface {

	public static void main(String[] args) {
		FuctIterface total = (a,b) -> a*b;
		System.out.println(total.multiply(5, 7));

	}

}
