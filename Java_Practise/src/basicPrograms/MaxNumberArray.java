package basicPrograms;

public class MaxNumberArray {

	public static void main(String[] args) {
		int[]arr= {2,4,8,3,6,34,2,33};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum value present in an Array is: " + max);
		System.out.println("Minimum value present in an Array is: " + min);

		}
		

	}


