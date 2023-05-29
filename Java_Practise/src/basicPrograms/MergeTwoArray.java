package basicPrograms;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[]abb= {2,5,3};
		int[]acc= {8,9,6};
		int length=abb.length+acc.length;
		int[]add=new int[length];
		int index=0;
		for (int i : abb) {
			add[index]=i;
			index++;
		}
		for (int j : acc) {
			add[index]=j;
			index++;
		}
		System.out.print(Arrays.toString(add));
	}

}
