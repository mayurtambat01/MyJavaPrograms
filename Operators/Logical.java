package Operators;
import java.util.Scanner;
public class Logical {
    
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        boolean isALargest=(a>=b && a>=c);  //Logical Operators (&&, ||, !);
        System.out.println(isALargest);
        System.out.println((a>=b || a<=c));    //Relational Operators (<,>,<=,>=)
        System.out.println(!(a>=b));
    }
}
