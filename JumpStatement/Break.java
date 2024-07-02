
package JumpStatement;
import java.util.Scanner;
public class Break {

    public static void main(String[] args) {
        System.out.println("Break");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int d=2;
        boolean Divided= false;
        while(d < n){
            if(n % d==0){
                Divided= true;
                break;
            }
            d++;

            }
            if(Divided){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
    
