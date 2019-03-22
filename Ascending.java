package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		//int[] array = {8, 6 , 3 , -19,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("Enter the elements of array : ");
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		System.out.println("In Ascending Order: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("In Descending Order : ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
