// [Binary Search] Search the Index of Elements in Array.

package SearchingAndSorting;

public class BinarySearch {

    public static int search(int a[],int n){
        int start = 0;
        int end = a.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(n==a[mid]){
                return mid;
            }else if (n > a[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int index = search(a, 7);
        System.out.println(index);
    }
    
}