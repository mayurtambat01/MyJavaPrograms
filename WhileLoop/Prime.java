package WhileLoop;

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int d=2;
        while (d <= n-1) {
            if (n%d==0) {
                System.out.println("Not Prime...");
                return;
            }
            d++;
        }
        System.out.println("Prime...");
    
    }
}
