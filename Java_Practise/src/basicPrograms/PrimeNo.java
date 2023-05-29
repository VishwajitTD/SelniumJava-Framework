package basicPrograms;

import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the No: ");
	int no= sc.nextInt();
	int count=0;
	for(int i=1; i<=no; i++) {
		if(no%i==0) {
			count++;
		}
	}
	if(count<=2) {
		System.out.println(no+" is prime Number ");
	}
	else {
		System.out.println(no+" is NOT prime Number");
	}
	sc.close();
	
}
}
