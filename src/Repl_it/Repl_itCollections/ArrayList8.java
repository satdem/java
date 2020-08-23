package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<Integer> c=new ArrayList<>(List.of(5,3,4,6,7));
        System.out.println(secondMax(c));

    }
    /*secondMax()  isminde bir method oluşturun.
Parametre olarak integer ArrayList.
Return tipi int olmalı.
ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün

ÖRN;
ArrayList   --  5,3,4,6,7
CEVAP : 6 */
    public static int secondMax(ArrayList<Integer> a){
        ArrayList<Integer> copy=new ArrayList<>(a);
        Collections.sort(copy);
        int max2=copy.get(copy.size()-2);
        return max2;
    }
}
