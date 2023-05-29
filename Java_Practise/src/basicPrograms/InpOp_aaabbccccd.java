package basicPrograms;

import java.util.LinkedHashMap;

public class InpOp_aaabbccccd {
	//input="InpOp_aaabbccccd" output="a3b2c4d"

	public static void main(String[] args) {
		String s="aaabbccccd";
		char[] arr= s.toCharArray();
		LinkedHashMap<Character, Integer> l1=new LinkedHashMap<>();
		for(int i=0; i<arr.length;i++)
		{
			if(!l1.containsKey(arr[i])){
				l1.put(arr[i], 1);
			}
			else {
				int x=l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (java.util.Map.Entry<Character, Integer> c : l1.entrySet()) {
			
			System.out.print(c.getKey());
			System.out.print(c.getValue());
		}

	}

}
