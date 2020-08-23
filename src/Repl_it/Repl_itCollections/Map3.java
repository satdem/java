package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map3 {
    /*ismi returnValue() olan bir method oluşturun.
Parametresi    String-Integer HashMap
Return tipi ArrayList
Bir Hashmap oluşturun ve değerleri Integer ve String'lerden oluşmalı.

Map
"Lion",         1
"Tiger",        2
"Elephant",  3
"Cat",          4
"Dog",         5

Tüm DEĞERLERİ (values) for döngüsü ile döndürün.  */
    public static ArrayList<Integer> returnValue(HashMap<String,Integer> hm){
        ArrayList<Integer> yeni=new ArrayList<>();
        for (Map.Entry entry:hm.entrySet()) {
            yeni.add((Integer) entry.getValue());
        }
        return yeni;
    }
}
