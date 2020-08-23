package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.HashSet;

public class Set2 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("banana");
        hs.add("strawberry");
        hs.add("kiwi");
        hs.add("pineapple");
        String a="banana";
        String b="peach";
        System.out.println(changeSet(hs,a,b));
    }
    /*changeSet() isminde bir method oluşturun.

Parametre olarak bir String HashSet   ve  iki String
return hashset olmalı
Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
ÖRNEK:
hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
String 1 = banana
String 2 = peach
CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
*/
    public static HashSet<String> changeSet(HashSet<String> hs, String str1, String str2){
        HashSet<String> yeni=new HashSet<>();
        for (String a:hs) {
           if(a.contains(str1)) {
               yeni.add(a.replaceAll(str1,str2));
           }
           else yeni.add(a);
        }
        return yeni;
    }
}
