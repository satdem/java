package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set3 {
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>(List.of("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2=new HashSet<>(List.of("Germany" , "China" , "Brazil" , "France" ,  "USA"));
        System.out.println(commonValues(hs1,hs2));
    }
    /*commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.

ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.

çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi yazdırınız.
*/
    public static ArrayList<String> commonValues(HashSet<String> a,HashSet<String> b){
        ArrayList<String> yeni=new ArrayList<>(a);
        yeni.retainAll(b);
        return yeni;
    }
}
