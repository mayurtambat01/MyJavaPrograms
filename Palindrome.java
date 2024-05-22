package String;
import java.util.Scanner;
public class Palindrome {

    public static boolean checkPAli(String str){
        boolean isPali = true;
        for(int i=0,j=str.length()-1;i < (str.length()/2);i++,j--){
            if (str.charAt(i)!=str.charAt(j)) {
                isPali = false;
                break;
            }
        }
        return isPali;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(checkPAli(str));
    }
    
}