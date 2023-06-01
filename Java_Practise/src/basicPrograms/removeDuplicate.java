package basicPrograms;

public class removeDuplicate {
	static char duplicates;
	public static void main(String[] args) {
		String s= "Rrr-2Mmm";
		char [] arr=s.toCharArray();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i]==arr[j]) {
					duplicates=arr[i];
				}
				
			}
			
		}
		System.out.println(duplicates);
		
		/*for (int k = 0; k < arr.length; k++) {
			if (arr[k]!='Z') {
				System.out.print(arr[k]+" ");
			}
		}*/

	}

}
