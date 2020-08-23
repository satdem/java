package Gun61;

import java.util.ArrayList;

public class soru12 {
    public static void main(String[] args) {
        Integer sayi=null;
        soru12 obje=null;//null her sınıfa atanabiliyordu

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);


        points.remove(1);  // 1,3,4,null
        // kim silinir 1 değerli elemanlı silinir yoksa 1 indexli elemanlı ? indexli olan silinir 2 değeri silinir.
        points.remove(null); // 1,3,4
        // remove metodu hem indexe hem de objeye göre siler, fakat önce indexe bakar.

        System.out.println(points);

       /* points.add(9);//bu 9 sayısını silmek istersem
        points.remove((Object)9);
        points.remove((Integer)9);
         //iki şekilde silebilirim*/
    }
}
//[1,3,4] cevap
