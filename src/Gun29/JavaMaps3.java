package Gun29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps3 {
    public static void main(String[] args) {
        //HashMap, LinkedHashMap, TreeMap

        Map<Integer,String> hm=new HashMap<>();//kendine göre sıralam yapar hızlıçalışmak için
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(3,"dog");
        hm.put(4,"swan");
        hm.put(7,"bear");
        hm.put(1,"sneak");
        System.out.println("hm = " + hm);

        Map<Integer,String> lhm=new LinkedHashMap<>();//ekleme sırasına göre saklar
        lhm.put(9,"fox");
        lhm.put(2,"cat");
        lhm.put(3,"dog");
        lhm.put(4,"swan");
        lhm.put(7,"bear");
        lhm.put(1,"sneak");
        System.out.println("lhm = " + lhm);

        Map<Integer,String> tm=new TreeMap<>();//key bazlı sıralam yapar
        tm.put(9,"fox");
        tm.put(2,"cat");
        tm.put(3,"dog");
        tm.put(4,"swan");
        tm.put(7,"bear");
        tm.put(1,"sneak");
        System.out.println("tm = " + tm);


    }
}
