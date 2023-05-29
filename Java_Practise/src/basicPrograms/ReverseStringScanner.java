package basicPrograms;

import java.util.Scanner;

public class ReverseStringScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=sc.next();
		String[]arr=s.split("");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.print("Reverse of Given String is: "+rev);
		sc.close();

	}

}
