

package basicPrograms;

public class CountTheTypesOfDifferentCharacters {

	public static void main(String[] args) {
		
		String s="@#%HJHjhjh12387";
		
		int digits=0;
		int specialChar=0;
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<=s.length()-1;i++) {
			 
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch)) {
			upperCase++;
		}
		else if(Character.isLowerCase(ch)) {
			lowerCase++;
		}
		else if (Character.isDigit(ch)) {
			digits++;
			}
		else {
			specialChar++;
		}
		}
		System.out.println("NO. of UpperCase presents are: "+ upperCase);
		System.out.println("NO. of Digits presents are: "+ digits);
		System.out.println("NO. of LowerCase presents are: "+ lowerCase);
		System.out.println("NO. of Spectial Charachters presents are: "+ specialChar);
	}

}
