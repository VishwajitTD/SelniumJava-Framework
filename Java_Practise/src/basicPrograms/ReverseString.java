package basicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="JeeT";
		String[]arr=s.split("");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.print(arr[i]);
		}
		
	}

}
