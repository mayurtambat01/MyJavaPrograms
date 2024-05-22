package String;
import java.util.Scanner;
public class countWords {

    public static int words(String str){
        int no = 1;
        for(int i=0;i < str.length()-1;i++){
            if (str.charAt(i)==' ') {
                no++;
            }
        }
        return no;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(words(str));
    }
}