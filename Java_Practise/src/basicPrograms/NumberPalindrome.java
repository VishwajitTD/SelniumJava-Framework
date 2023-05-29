package basicPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int no= sc.nextInt();
		int copy= no;
		int reverse=0;
		while(no!=0) {
			int remainder=no%10;
			reverse=reverse*10+remainder;
			no=no/10;
		}
		if(copy==reverse) {
			System.out.println(copy+" is palindrome");
		}
		else{
			System.out.println(copy+" is NOT palindrome");
		}
		sc.close();
				

	}

}
