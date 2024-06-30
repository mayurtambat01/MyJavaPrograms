// Print the Array Using User Input.

package Array;
import java.util.Scanner;
public class UserInputArray {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n= s.nextInt();
        int input[] = new int[n];

        for(int i=0;i < n;i++){
            input[i] = s.nextInt();
        }
        for(int i=0;i < n;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}