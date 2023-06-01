package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class FetchMissingNO {
    public static void main(String[] args) {
        List<Integer> missingNumbers = new ArrayList<>();
        int[] arr = {1, 3, 5, 9};

        for (int no = 1; no <= 100; no++) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == no) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(no);
            }
        }

        System.out.println("Missing numbers: " + missingNumbers);
    }
}
