package basicPrograms;

public class ClaculateTheAvrgInArray {

	public static void main(String[] args) {
		int arr[]= {10,11,9,8,12,10,10,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("The average sum given in an array is "+avg);

	}

}
