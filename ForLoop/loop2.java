package ForLoop;

import java.util.Scanner;

public class loop2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input the first term (a), common difference (d), and the number of terms (n)
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
 
        // Print the terms of the arithmetic progression
        System.out.println("The terms of the arithmetic progression are:");

        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
    }
    
}