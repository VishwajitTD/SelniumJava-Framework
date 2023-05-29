package basicPrograms;

public class removeDuplicate {

	public static void main(String[] args) {
		String s= "Karnataka";
		char [] arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr[j]='Z';
				}
				
			}
			
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k]!='Z') {
				System.out.print(arr[k]+" ");
			}
		}

	}

}
