package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OrderOfOccurance {

	public static void main(String[] args) {
		String s="aaaabbbccd";
		char[]a=s.toCharArray();
		Map<Character, Integer> m=new HashMap<>();
		for (char c : a) {
			if(m.containsKey(c)) {
				int count=m.get(c);
				m.put(c, count+1);
				
			}
			else {
				m.put(c,1);
			}
		}
		
		for (Entry<Character, Integer> op : m.entrySet()) {
			//System.out.print(op.getKey()+" ");
			//System.out.print(op.getValue()+" ");
			System.out.print(op+" ");
			
			
		}

	}

}
