package Gun27;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        birlestir(setA,setB);
        System.out.println("birlestir(setA,setB) = " + birlestir(setA,setB));
        System.out.println("Farkını bul = " + farkibul(setA,setB));
        System.out.println("ortak elemanları bul = " + ortakelemanbul(setA,setB));
    }
    public  static HashSet<Integer> birlestir(HashSet<Integer> a,HashSet<Integer> b){
        HashSet<Integer> birlesik=new HashSet<>();
        birlesik.addAll(a);
        birlesik.addAll(b);
        return birlesik;
    }
    public  static HashSet<Integer> farkibul(HashSet<Integer> a,HashSet<Integer> b){
        HashSet<Integer> fark=new HashSet<>(a);//burada fark a ya eşit olsun demek istiyor
        fark.removeAll(b);
        return fark;
    }
    public  static HashSet<Integer> ortakelemanbul(HashSet<Integer> a,HashSet<Integer> b){
        HashSet<Integer> ortakeleman=new HashSet<>(a);
        ortakeleman.retainAll(b);
        return ortakeleman;
    }
}
