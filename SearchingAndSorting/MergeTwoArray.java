// [Merge] Two Sorted Array Merge in Array.

package SearchingAndSorting;

public class MergeTwoArray {

    public static int[] merge(int a[],int b[]){
        int i=0;
        int j=0;
        int k=0;
        
        int ans[]=new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            }else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int b[]={0,2,4,6,8};
        int ans[]=merge(a, b);
        for(int i=0;i < ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}