package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    /*returnKey() isminde bir method oluşturun.
Parametresi     String-Integer HashMap olsun.
Return tipi Array List olsun.
Hashmap:
"Lion",     1
"Tiger",    2
"Elephant", 3
"Cat",      4
"Dog",      5
Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
*/
    public static ArrayList<String> returnKey(HashMap<String,Integer> hm){
        ArrayList<String> yeni=new ArrayList<>();
        for (Map.Entry entry:hm.entrySet()) {
           yeni.add((String) entry.getKey());
        }
        return yeni;
    }

}
