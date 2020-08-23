package Repl_it.Repl_itCollections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Set4 {
    public static void main(String[] args) {
        LinkedHashSet<String> lah=new LinkedHashSet<>(List.of( "Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String s1="Germany";
        String s2="USA";
        System.out.println(removing(lah,s1,s2));
    }
    /*removing() isminde bir method oluşturun.
Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
Eğer Stringler LinkedHashset 'in içinde varsa, sil.
Return tipi linkedhashset
Örneğin,
linkedhashset : Germany , France , USA , Canada , Mexico , Brazil

String 1= "Germany"
String 2 = USA
Germany ve USA 'i sil.
Set'i döndür.
*/
    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs,String a,String b){
        LinkedHashSet<String> yeni=new LinkedHashSet<>(lhs);
        if(yeni.contains(a) ||yeni.contains(b)){
            yeni.remove(a);
            yeni.remove(b);

        }
      return yeni;
    }
}
