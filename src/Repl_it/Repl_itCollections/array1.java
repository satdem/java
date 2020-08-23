package Repl_it.Repl_itCollections;

public class array1 {
    public static void main(String[] args) {

        int[] id=new int[]{1,2,3,4};
        System.out.println( duplicate(id));
    }
    /*
duplicate() isminde bir method oluşturun.
Parametresi int Array olmalı
Return tipi boolean
Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

Örnek1:
Input: [1,2,3,1]
Output: true
Örnek 2:
Input: [1,2,3,4]
Output: false*/
    public static boolean duplicate(int[] a){
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){ b=true; break;}

            }
        }
        return b;
    }
}
