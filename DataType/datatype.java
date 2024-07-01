// All Primitive Datatypes.

public class datatype {
    
    public static void main(String[] args) {

        char c='a';
        System.out.println(c+3);

        int i=c+10;
        System.out.println(i);

        i=c;
        char abc=(char)i;     //Explicity Typecasting
        System.out.println(abc);

        long l=12345678909877l;
        int p=(int)l;       //Explicity Typecasting
        System.out.println(p);
        System.out.println(l);

        double d=i;
        System.out.println(d);
        // i=d;

        float f=i;
        System.out.println(f);
        // i=f;

        float s=1.23f;
        System.out.println(s);
        // p=d;
        d=s;
    }
}