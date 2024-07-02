package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args) {
        
    System.out.println("Enter Numbers");
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();

    int i=1;
    while(i <= n){
    System.out.println(i);
    i++;
    }
}
}
