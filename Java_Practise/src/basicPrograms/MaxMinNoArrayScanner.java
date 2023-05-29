package basicPrograms;

import java.util.Scanner;

public class MaxMinNoArrayScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//lets decide the size of an array : "n"
		System.out.print("Enter the no. of elements in th Array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the elements on each index: ");
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum value present in an Array is: " + max);
		System.out.println("Minimum value present in an Array is: " + min);

		sc.close();
	}

}
