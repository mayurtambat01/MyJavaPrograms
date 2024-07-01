package Generics;

public class Print {

    public static<T> void printArray(T a[]){
        for(int i=0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a1=new Integer[10];
        for(int i=0;i < 10;i++){
            a1[i]=i + 1;
        }
        String a2[]=new String[10];
        for(int i=0;i < 10;i++){
            a2[i]="You";
        }
        printArray(a2);
        printArray(a1);
    }
    
}