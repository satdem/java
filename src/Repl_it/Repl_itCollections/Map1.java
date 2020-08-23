package Repl_it.Repl_itCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

    Map<Integer,String> map=new HashMap<Integer, String>();
    map.put(1, "Lion");
    map.put(2, "Tiger");
    map.put(3, "Elephant");
    map.put(4, "Cat");
    map.put(5, "Dog");
    int a=3;
        System.out.println(map1(map,a));
    /*map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
*/    }

    public static String map1(Map<Integer,String> m,int a){
        String str=m.get(a);
        return str;
    }
}
