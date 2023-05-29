package basicPrograms;

public class FirstSecondThirdMaxInArray {

	public static void main(String[] args) {
		int []arr= {4,7,9,3,1,6,5};
		int firstMax=arr[0];
		int secondMax=arr[0];
		int thirdMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				thirdMax=secondMax;
				secondMax=firstMax;
				firstMax=arr[i];
				}
			else if(arr[i]>secondMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]>thirdMax) {
				thirdMax=arr[i];
			}
		}
		System.out.println("First Maximum value present in an Array is: " + firstMax);
		System.out.println("Second Minimum value present in an Array is: " + secondMax);
		System.out.println("Thried Maximum value present in an Array is: " + thirdMax);

	}

}
