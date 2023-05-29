package basicPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		int[]arr= {2,4,6,1,8,9,7};
		int target=7;
		int index = linearSearch(arr,target);
		if(index!=143) {
			System.out.println(target+" is found in the Array at index of "+index);
		}
		else {
			System.out.println(target+" is Not found in the Array ");
		}

	}

	private static int linearSearch(int[] arr, int target) {

			for(int i=1;i<arr.length;i++) {
				if(arr[i]==target) {
					return i;
				}
			}
			return 99;
		
	}

}
