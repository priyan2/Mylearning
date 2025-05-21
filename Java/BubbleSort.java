package demo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the no.of elements");
		int size = sc.nextInt();
		sc.close();
		int[] arr = new int[size];
		System.out.println("Enter the array elemnts : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			
			System.out.println(Arrays.toString(arr));
	}

}
