package basicPrograms;

//import java.util.ArrayList;
//import java.util.Collections;

public class FetchDuplicatesAndReverse {
    public static void main(String[] args) {
        String str = "Hiii Hiii Byeee Byeee";
        String [] abb=str.split(" ");
        
        for(int k=0;k<abb.length;k++)
        {
            char[] arr = abb[k].toCharArray();
            int count=0;
          //  ArrayList<Character> duplicates = new ArrayList<Character>();

            for (int i = 0; i < arr.length; i++) {
            	
                for (int j = i + 1; j < arr.length; j++) {
                	
                    if (arr[i] == arr[j]  ) {
                    	
                    	System.out.println("duplicates characters presents are: "+arr[j]);
                    	count++;
                        //duplicates.add(arr[j]);
                    }
                }
            }
            System.out.println("    "+"the number of duplicates presents are: "+count);
            
        }
      //  System.out.println("Duplicate characters are: " + duplicates);
       // Collections.reverse(duplicates);
      //  System.out.println("Duplicate characters in reverse order are: " + duplicates);
    }
}
