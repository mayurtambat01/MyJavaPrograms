package Generics;

public class PairUse {

    public static void main(String[] args) {
        
        Pair<Integer,Integer> p=new Pair<Integer,Integer>(8, 9);
        p.setFirst(10);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        
        Pair<Character,Integer> p1=new Pair<Character,Integer>('A', 90);
        p1.setSecond(50);
        System.out.println(p1.getSecond());
        System.out.println(p1.getFirst());

        Pair<String,Character> s= new Pair<String,Character>("Abs", 'x');
        s.setFirst("YOU");
        System.out.println(s.getFirst());
        System.out.println(s.getSecond());

        int a=1;
        int b=2;
        int c=3;

        Pair<Integer,Integer> pairInteger= new Pair<Integer,Integer>(a, b);

        Pair<Pair<Integer,Integer>,Integer> p3=new Pair<Pair<Integer,Integer>,Integer>(pairInteger, c);

        System.out.println(p3.getSecond());
        System.out.println(p3.getFirst().getFirst());
        System.out.println(p3.getFirst().getSecond());
    }
    
}