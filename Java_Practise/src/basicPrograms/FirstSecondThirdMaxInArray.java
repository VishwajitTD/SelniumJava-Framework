package basicPrograms;

public class FirstSecondThirdMaxInArray {

	public static void main(String[] args) {
		int []arr= {4,7,9,3,1,6,5};
		
		int largest=arr[0];
		int smallest=arr[0];
		/*int firstMax=arr[0];//4,4,9
		 int secondMax=arr[0];//4,4,7
		int thirdMax=arr[0];//4,7,4
		*/
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]>smallest) {
				smallest=arr[i];
			}
			
			/*if(arr[i]>firstMax) {
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
			*/
		}
		System.out.println("largest: "+largest);
		System.out.println("smallest: "+smallest);
		/*System.out.println("First Maximum value present in an Array is: " + firstMax);
		System.out.println("Second Minimum value present in an Array is: " + secondMax);
		System.out.println("Thried Maximum value present in an Array is: " + thirdMax);
*/
	}

}
