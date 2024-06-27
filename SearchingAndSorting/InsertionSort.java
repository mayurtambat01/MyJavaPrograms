// [Insertion Sort] Sort the Elements of Array.

package SearchingAndSorting;

public class InsertionSort {
 
    public static void sort(int a[]){
        for(int i=1;i < a.length;i++){
            int j=i-1;
            int n = a[i];
            while (j >= 0 && a[j] > n) {
                a[j+1] = a[j];
                j--;       
            }
            a[j+1] = n;
        }
    }

    public static void main(String[] args) {
        int a[]={0,9,8,7,6,5,4,3,2,1};
        sort(a);
        for(int i=0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
