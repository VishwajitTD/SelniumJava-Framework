package basicPrograms;

public class SorrtAnArrayAsc {
	public static void main(String[] args) {
		int arr []= {3,4,2,8,6,9};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]>arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;//ascending
					
					
				}
				/*for Ascending
				 * 
				 * if(arr[j+1]>arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;//ascending
					
					
				}*/
			}
			
			
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
	}
	}
	

}
