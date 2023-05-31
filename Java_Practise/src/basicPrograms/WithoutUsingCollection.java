package basicPrograms;
public class WithoutUsingCollection {
    public static void main(String[] args) {
        String input = "Testyantra in Bangalore";
        StringBuilder duplicates = new StringBuilder();
        StringBuilder reverseDuplicates = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (input.indexOf(c) != input.lastIndexOf(c) || c == ' ') {
                if (duplicates.indexOf(String.valueOf(c)) == -1) {
                    duplicates.append(c);
                    reverseDuplicates.insert(0, c);
                }
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Duplicate characters: " + duplicates);
        System.out.println("Reverse of duplicates: " + reverseDuplicates);
    }
}
