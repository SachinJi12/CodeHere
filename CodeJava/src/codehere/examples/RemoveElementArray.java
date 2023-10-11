package codehere.examples;

import java.util.Arrays;

public class RemoveElementArray {

	public static void main(String[] args) {
		
		 int [] orignialArray= {1,2,3,4,5,6,7}; 
		 int elementToBeRemove= 3;
		 
		 int[] newArray = remove(orignialArray,elementToBeRemove);
		 System.out.println("Oringinal Array :- "+Arrays.toString(orignialArray));
		 System.out.println("Removed Array :- "+Arrays.toString(newArray));

	}

	public static int[] remove(int[] array,int element) {
		
		int[] newArray = new int[array.length-1];
		int index=0;
		for(int i=0;i< array.length;i++) {
			if(array[i]!=element) {
				newArray[index]=array[i];
				index++;
			}
		}
		return newArray;
	}

}
