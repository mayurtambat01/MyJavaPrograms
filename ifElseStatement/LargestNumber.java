package ifElseStatement;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Enter Three Numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a+" is Large");
        }else if (b >= a && b >= c) {
            System.out.println(b+" is Large");
        }else {
            System.out.println(c+" is Large");
        }
    }
}