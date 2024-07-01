package Function;

public class OverLoading1 {

    public static int sum(int a,int b){
        int ans=a * b;
        return ans;
    }

    public static double sum(double a,double b){
        return a - b;
    }

    public static int sum(int a){
        return a+1;
    }

    public static void main(String[] args){

        int a=10;
        int b=5;
        int output=sum(a,b);

        System.out.println(output);

        System.out.println(sum(10.8, 2.8));

        System.out.println(sum(a));
    }
    
}