package TwoDArray;

import java.util.Scanner;

public class ArrayUse {
    
    public static int[][] takeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Row");
        int row= s.nextInt();
        System.out.println("Enter Col");
        int col= s.nextInt();

        int a[][]= new int[row][col];

        for(int i=0;i < row;i++){
            for(int j=0;j < col;j++){
                System.out.println("Enter Elements at "+i+" row "+j+" col ");
                a[i][j]= s.nextInt();
            }
        }
        return a;
    }

    public static void print(int a[][]){
        int row= a.length;
        int col= a[0].length;

        for(int i=0;i < row;i++){
            int sum=0;
            for(int j=0;j < col;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        // int arr[][]={{1,2,3},{4,5,6}};
        int arr[][]=takeInput();
        print(arr);
        // System.out.println(arr.length);

        // for(int i=0;i < 2;i++){
        //     System.out.println(arr[i].length);
        // }
        
    }
}
