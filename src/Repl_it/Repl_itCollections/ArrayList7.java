package Repl_it.Repl_itCollections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(List.of( 3 , 2 , 5 , 6));
        ArrayList<Integer> b=new ArrayList<>(List.of( 9, 5 , 8));
        System.out.println("common_values(a,b) = " + common_values(a,b));
    }
    /*common_values() isminde bir method oluşturun.

Parametre olarak 2 tane Integer ArrayList 
Return tipi integer ArrayList olmalı
İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün 

Örneğin; 
ArrayList 1:    3 , 2 , 5 , 6
ArrayList 2:     5 , 8 , 9
return  5 olmalı

Örneğin;
ArrayList 1: 8,7,9,6,7
ArrayList 2: 6,7,12,3,1
return 6 ve 7 olmalı*/
    public static ArrayList<Integer> common_values(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ortak=new ArrayList<>(a);
        ortak.retainAll(b);
        return ortak;
    }

}
