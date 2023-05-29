package basicPrograms;

public class CountVowels {

	public static void main(String[] args) {
		String s= "Vishwajeet";
		String[]arr=s.split("");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println(count);
		

	}

}
