package IncrementDecrement;

public class IncreDecre {
    
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);
        a++;
        ++a;
        System.out.println(a);

        int b= a++;
        System.out.println(b);
        System.out.println(a);

        a=4;
        a *=2;
        System.out.println(a);

        a ^= 2;
        System.out.println(a);

        int c= 2*8/2;
        System.out.println(c);

        int d=2+4*6;
        System.out.println(d);
    }
}
