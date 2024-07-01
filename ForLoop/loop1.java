package ForLoop;

import java.util.Scanner;

public class loop1 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // int i=1;
        // int sum=0;
        // while(i <= n){
        //     sum=sum+i;
        //     i=i+1;
        // }
        // System.out.println(sum);

        int sum=0;
        for(int j=1;j <= n;j++){
            sum=sum+j;
        }
        System.out.println(sum);

    }
    
}