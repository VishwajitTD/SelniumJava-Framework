package basicPrograms;

import java.util.Scanner;

public class Max123NoArrayScanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenght of Array: ");
		int l=sc.nextInt();
		System.out.println("Enter the elements on each Index: ");
		int [] arr= new int[l];
		for(int i=0;i<l;i++) {
			arr[i]=sc.nextInt();
		}
		int firstMax=arr[0];
		int secondMax=arr[0];
		int thirdMax=arr[0];
		for(int i=0;i<l;i++) {
			if(arr[i]>firstMax) {
				thirdMax=secondMax;
				secondMax=firstMax;
				firstMax=arr[i];
			}
			else if(arr[i]>secondMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]> thirdMax) {
				thirdMax=arr[i];
			}
		}
		System.out.println("First Maximum value present in an Array is: "+ firstMax);
		System.out.println("Second Maximum value present in an Array is: "+ secondMax);
		System.out.println("Third Maximum value present in an Array is: "+ thirdMax);
	sc.close();
	}

}
