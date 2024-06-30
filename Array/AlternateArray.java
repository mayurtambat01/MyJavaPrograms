// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

package Array;

public class AlternateArray {
    
    public static void alternateElement(int a[]){
        for(int i=0;i < a.length;i+=2){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        alternateElement(a);
    }
    }

