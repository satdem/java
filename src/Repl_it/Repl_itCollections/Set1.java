package Repl_it.Repl_itCollections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>(List.of(4,2,3,1,7));
        System.out.println(totalCount(hs));
    }
    /*Create a method totalCount()
totalCount() isminde bir method oluşturun.
Parametresi  'Integer Hashset' olmalı
HashSetteki eleman sayısını alın.
totalCount'u döndürün.

Örnek:
hashset ; 4,2,3,1,7
cevap: 5*/
    public static int totalCount(HashSet<Integer> hs){
        int count=0;
        for (Integer a:hs) {
            count++;
        }
        return count;
    }
}
