// Given an array arr of size n, swap the kth element from the beginning with kth element from the end.

package Array;

public class SwapKthElement {

    public static void swap(int a[],int n,int k){
        int temp = a[k-1];
        a[k-1] = a[n-k];
        a[n-k] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n=8;
        int k=7;
        swap(a, n, k);
        for(int num : a){
            System.out.print(num+" ");
        }
    }
    
}