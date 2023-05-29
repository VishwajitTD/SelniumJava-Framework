package basicPrograms;

public class RorateAnArrayFor1Times {

	public static void main(String[] args) {
		int[]arr= {2,4,5,7,8};
		int[]updated=rotate(arr,2);
		for(int k=0;k<updated.length;k++) {
			System.out.print(updated[k]+" ");
		}

	}

	public static int[] rotate(int[] abb, int times) {
		for(int i=1;i<=times;i++) {
			int temp=abb[0];
			for(int j=0;j<abb.length-1;j++) {
				abb[j]=abb[j+1];
			}
			abb[abb.length-1]=temp;
		}
		return abb;
		
	}

}
