// Given a string s , return reverse of the string as output.

package String;
import java.util.Scanner;
public class ReverseString {
    
    public static String reverse(String str){
        String Reverse = "";
        for(int i=str.length()-1;i >= 0;i--){
            Reverse += str.charAt(i);
        }
        return Reverse;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverse(str));
    }
}
