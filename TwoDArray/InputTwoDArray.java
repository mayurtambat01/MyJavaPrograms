
package TwoDArray;
import java.util.Scanner;
public class InputTwoDArray {
    
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter rows");
        int rows= s.nextInt();
        System.out.println("Enter Cols");
        int cols= s.nextInt();
        
        int arr[][]= new int[rows][cols];
        for(int i=0;i < rows;i++){
            for(int j=0;j < cols;j++){
                System.out.println("Enter elements at "+i+" rows "+j+" cols");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i < rows;i++){
            for(int j=0;j < cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
