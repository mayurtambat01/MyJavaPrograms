/* Given an unsorted array arr[] of n integers and a key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).(0 based indexing is used)
If the key does not exist in the array then return -1 for both start and end index in this case.*/

package Array;

public class FindIndexArray {

    public static int[] find(int a[],int n,int key){
        int startindex = -1;
        int endindex = -1;

        for(int i=0;i < n;i++){
            if (a[i]==key) {
                if (startindex == -1) {
                    startindex = i;
                }
                endindex = i;
            }
        }
        return new int[]{startindex,endindex};
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,6,4,5,6,7,8};
        int key = 6;
        int result[] = find(a, a.length, key);
        System.out.println("{"+result[0]+","+result[1]+"}");
        
    }
    
}