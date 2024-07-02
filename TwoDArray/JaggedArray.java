package TwoDArray;

public class JaggedArray {
    
    public static void main(String[] args){
        int arr[][]= new int[3][4];
        System.out.println(arr[0][0]);
        for(int i=0;i < arr.length;i++){
        System.out.println(arr[i]);
        }
        int arr1[][]= new int[3][];
        
        for(int i=0;i < arr1.length;i++){
            arr1[i]= new int[2];
            System.out.println(arr1[i]);
            
            }
            System.out.println(arr1[0][0]);
}
}
