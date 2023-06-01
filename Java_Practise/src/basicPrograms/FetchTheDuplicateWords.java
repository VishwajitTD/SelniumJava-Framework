package basicPrograms;

public class FetchTheDuplicateWords {

	public static void main(String[] args) {
		String str="Hi Hi my my name name is is jeet jeet";
		String[]arr=str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println("Duplicate list : " +arr[i]);
					
					count++;
				}
			}
		}
		System.out.println("       THe Duplicate words present in given strings are: "+count);

	}

}
