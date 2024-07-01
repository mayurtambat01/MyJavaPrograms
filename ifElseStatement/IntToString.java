package ifElseStatement;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        if (n==1) {
            System.out.println("ONE");
        }else if (n==2) {
            System.out.println("TWO");
        }else if(n==3){
            System.out.println("THREE");
        }else{
            System.out.println("NONE");
        }
    }    
}