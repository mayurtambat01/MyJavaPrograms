package Function;

public class PassByValue {

    public static int Decrement(int b){
        b=b-2;
        return b;
    }
    public static void increment(int n){           
            n=n+1;
        }

    public static void main(String[] args){
        int c=100;
        c= Decrement(c);
        System.out.println(c);

        int a=10;
        increment(a);
        System.out.println(a);
    }
    
}