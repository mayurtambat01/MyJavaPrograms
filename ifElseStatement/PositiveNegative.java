package ifElseStatement;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        if (n > 0) {
            System.out.println(n+" Number is Positive");
        }else{
            System.out.println(n+" Number is Negative");
        }
    }
    
}