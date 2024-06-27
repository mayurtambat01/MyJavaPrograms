public class SumofSeries{

    public static long sum(int n){
        return (long) n *(n + 1)/2;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println(sum(n));
    }
}