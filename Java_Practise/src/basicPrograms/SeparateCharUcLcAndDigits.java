package basicPrograms;

public class SeparateCharUcLcAndDigits {

	public static void main(String[] args) {
		
		String s="@#%HJHjhjh12387";
		
		String digits="";
		String specialChar="";
		String upperCase="";
		String lowerCase="";
		for(int i=0;i<=s.length()-1;i++) {
			 
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch)) {
			upperCase=upperCase+ch;
		}
		else if(Character.isLowerCase(ch)) {
			lowerCase=lowerCase+ch;
		}
		else if (Character.isDigit(ch)) {
			digits=digits+ch;
			}
		else {
			specialChar=specialChar+ch;
		}
		}
		System.out.println("UpperCase presents are: "+ upperCase);
		System.out.println("Digits presents are: "+ digits);
		System.out.println("LowerCase presents are: "+ lowerCase);
		System.out.println("Spectial Charachters presents are: "+ specialChar);
	}

}
