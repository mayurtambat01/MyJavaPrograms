// [BubbleSort] Sort the Elements of Array.

package SearchingAndSorting;

public class BubbleSort {

    public static void sort(int a[]){
        for(int i=0;i < a.length;i++){
            for(int j=0;j < a.length-1;j++){
                while (a[j] > a[j+1]) {
                    int n=a[j];
                    a[j] = a[j+1];
                    a[j+1] = n;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={0,9,8,7,6,5,4,3,1,2};
        sort(a);
        for(int i=0;i < a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    
}