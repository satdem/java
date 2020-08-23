package Repl_it.Repl_itCollections;

import java.util.ArrayList;

public class Array2D9 {
    /*Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
Store all the elements in one arraylist and print the arraylist
Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
Örnek:
Girdi:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Çıktı: [1,2,3,4,5,6,7,8,9]*/
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int[][] id={{ 1,2,3},
                {4,5,6},
                {7,8,9}};
        for (int i = 0; i <id.length ; i++) {
            for (int j = 0; j <id[i].length ; j++) {
                a.add(id[i][j]);

            }
        }
        System.out.println("a = " + a);
    } 
}
