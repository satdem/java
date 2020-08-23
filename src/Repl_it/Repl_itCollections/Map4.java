package Repl_it.Repl_itCollections;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"New Jersey");
        hm.put(2,"New York");
        hm.put(3,"London");
        hm.put(4,"Paris");
        int a=3;
        String s="Ankara";
        System.out.println(update(hm,a,s));
    }
    /*ismi update() olan bir method oluşturun.
 Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
return tipi  Integer - String HashMap
Eğer HashMap, int olan parametreyi içeriyorsa,
int değerinde var olan String'i güncelleyin.
Örnek :

 Hash map:
1, "New jersey"
2, "New York"
3, "London"
4, "Paris"*/
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm,int i,String s){
        HashMap<Integer,String> yeni=new HashMap<>(hm);
        for (Map.Entry entry:yeni.entrySet()) {
            if(i==(int)entry.getKey()){
               yeni.replace(i,s);
            }
        }
        return yeni;
    }
}
