
package basicPrograms;

import java.util.ArrayList;

public class DemoFetchMissing {
	public static void main(String[] args) {
		int[]arr= {1,2,5,6};
		ArrayList<Integer> l=new ArrayList<>();
		for(Integer l1:arr)
		{
			l.add(l1);
		}
		for(int i=1;i<=100;i++)
		{
			if(!l.contains(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
