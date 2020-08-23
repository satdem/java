package Gun27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTreeSet4 {
    public static void main(String[] args) {
        // HashSet, LinkedHashSet,TreeHashSet
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();//ekleme sırasına göre saklar
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts=new TreeSet<>();//alfabetik sıraya göre  ya da küçükten büyüğe saklar
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        TreeSet<Integer> ts2=new TreeSet<>();//alfabetik sıraya göre  ya da küçükten büyüğe saklar
        ts2.add(85);
        ts2.add(5);
        ts2.add(6);
        ts2.add(63);
        ts2.add(17);
        System.out.println("ts2 = " + ts2);


    }
}
