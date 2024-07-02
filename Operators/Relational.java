package Operators;
import java.util.Scanner;
public class Relational {
    
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

        int i,j;
        i= sc.nextInt();
        j= sc.nextInt();
        boolean isEq=(i==j);
        boolean nEq=(i!=j);
        boolean isGre=(i>j);
        boolean  isGreEq=(i>=j);
        boolean isLess=(i<j);
        boolean isLessEq=(i<=j);

        System.out.println("is Equal "+isEq);
        System.out.println("Not Equal "+nEq);
        System.out.println("is Greater "+isGre);
        System.out.println("is Greater than Equal "+isGreEq);
        System.out.println("is Less "+isLess);
        System.out.println("is Less than Equal "+isLessEq);
    }
}