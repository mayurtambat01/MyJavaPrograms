// Print the Array Using User Input And Also Print the Largest Element in the Array.

package Array;

import java.util.Scanner;

public class LargestInArray {

    public static int[] takeinput(){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int input[]=new int[n];

        for(int i=0;i < n;i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void print(int input[]){
        int n=input.length;

        for(int i=0;i < n;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static int largestElem(int input[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i < input.length;i++){
            if (input[i] > max) {
                max = input[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int input[]=takeinput();
        print(input);
        int largest = largestElem(input);
        System.out.println("Largest is "+largest);
    }
    
}