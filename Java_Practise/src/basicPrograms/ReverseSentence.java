package basicPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="Welcome to Bangalore my friend";
		String[]arr1=s.split(" ");
		for(int i=arr1.length-1;i>=0;i--) {
			if(i==i/2) {
			String rem="";
			
			for(int j=arr1.length-1;j>=0;i--) {
				rem=rem+s.charAt(i);
			}
			}
			else {
				System.out.print(arr1[i]+" ");
			}
		
		}

	}

}
