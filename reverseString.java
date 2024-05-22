package String;
import java.util.Scanner;
public class reverseString {

    public static String rev(String str){
        String Rev="";
        for(int i=str.length()-1;i >= 0;i--){
            Rev += str.charAt(i);
        }
        return Rev;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(rev(str));
    }
}