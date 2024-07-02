package WhileLoop;

import java.util.Scanner;

public class SumOfnNumber {

    public static void main(String[] args) {
        
    int n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();

    int i=1;
    int sum= 0;
    while(i <= n){
        sum=sum+i;
        i++;
    }
    System.out.println(sum);
}
}
