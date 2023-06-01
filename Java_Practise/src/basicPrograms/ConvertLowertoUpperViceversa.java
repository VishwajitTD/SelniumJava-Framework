package basicPrograms;

public class ConvertLowertoUpperViceversa {
	static char ch;
	
	public static void main(String[] args) {
		String s1="HeLLo";
		String s2 = "";
		for(int i=0;i<=s1.length()-1;i++) {
			ch=s1.charAt(i);
			
			if((ch>=97)&&(ch<=122)) {
				s2=s2+(char)(ch-32);
			}
			else {
				s2=s2+(char)(ch+32);
			}
		}
		System.out.println(s2);
		
	}

}
