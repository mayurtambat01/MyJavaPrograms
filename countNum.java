
public class countNum {

    static int count = 0;
    public static int countDigits(int n){
        if (n > 0) {
            count++;
            countDigits(n/10);
        }
        return count;
    }

    public static void main(String[] args) {
        int n= 10000;
        System.out.println(countDigits(n));        
    }
}