package basicPrograms;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int fact = 1;
        
        for (int i = N; i >= 1; i--) {
            fact *= i;
        }
        
        System.out.print("Factorial of " + N + " is: " + fact);
        scanner.close();
    }
}

