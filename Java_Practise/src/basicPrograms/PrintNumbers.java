package basicPrograms;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.println("Numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}

