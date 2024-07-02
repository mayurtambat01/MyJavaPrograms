package Variable;

public class ScopeOfVariable {
    
    public static void main(String[] args) {
        int i=10;
        System.out.println(i);

        //int i=12;                       //Not Allowed;
        if(i==12){
            int n=13;
            System.out.println(n);
        }
        // System.out.println(n);         //Not Allowed;
        int n=4;
        System.out.println(n);

        i=1;
        while(i <= n){
            int j=1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
