package basicPrograms;
import java.util.LinkedHashSet;
import java.util.Set;

public class FetchDuplicateReverse {
    public static void main(String[] args) {
        String input = "Testyantra in Bangalore";

        Set<Character> duplicates = new LinkedHashSet<>();
        StringBuilder reverseDuplicates = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (input.indexOf(c) != input.lastIndexOf(c) || c == ' ') {
                if (!duplicates.contains(c)) {
                    duplicates.add(c);
                    reverseDuplicates.insert(0, c);
                }
            }
        }

        StringBuilder duplicateChars = new StringBuilder();
        for (char c : duplicates) {
            duplicateChars.append(c);
        }

        System.out.println("Input: " + input);
        System.out.println("Duplicate characters: " + duplicateChars);
        System.out.println("Reverse of duplicates: " + reverseDuplicates);
    }
}
