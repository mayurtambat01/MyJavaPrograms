// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

public class PrintAlternateElem{

    public static void Print(int a[],int n){
        for(int i=0;i < n;i+=2){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        
    }

}