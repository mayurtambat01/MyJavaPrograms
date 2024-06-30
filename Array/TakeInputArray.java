// Print the Array Using User Input.

package Array;
import java.util.Scanner;
public class TakeInputArray {

    public static int[] takeinput(){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];

        for(int i=0;i < n;i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void print(int input[]){
        int n = input.length;
        for(int i=0;i < n;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int input[] = takeinput();
        print(input);
    }
}
