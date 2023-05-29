package basicPrograms;

public class Recursion {

	public static void main(String[] args) {
		recursion(1);
	}

	private static void recursion(int no) {
 
		if(10>=no) {
			
			if(no%2==0) {
				System.out.print(" even: "+no);//even
			}
			
			else {
				System.out.print(" odd: "+no);//odd
			}
			
			no++;
			recursion(no);
		}
		
	}
}
