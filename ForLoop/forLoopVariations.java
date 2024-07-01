package ForLoop;

public class forLoopVariations {

    public static void main(String[] args) {
        
        int n=5;

        // for(int i=1, j=20;i <= n && j <= 60; i++, j+=15){     //For Loop Variations
        //     System.out.println(i+ " " +j);
        // }

        for(int i=1; i <=5; i++){
            for(int j=1;j <= 4;j++){
                System.out.println("i "+ i + " j "+ j);
            }
        }
    }
    
}