package Gun28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        //Create method that generates a hashSet of
        //given numbers [1,2,3,4,5,6,7,8]
        //bu işlemi generateSet() metodunda yapınız.

        //-sonra AddElements şeklinde bir metodla 1 veya birden fazla sayı eklenen metodu yazınız

        // -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek
        // main de bir Array e eşitleyiniz.

        // -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek
        // main de bir ArrayList e eşitleyiniz.
        Set<Integer> hs=generateSet();
        AddElements(hs,1,9,14);
        System.out.println("hs = " + hs);
        AddElements(hs,1,2,3,4,5,101,102,103);
        System.out.println("hs = " + hs);
        AddElements(hs,65);
        System.out.println("hs = " + hs);

        int[] ihs=convertToArray(hs);
        System.out.println("Arrays.toString(ihs) = " + Arrays.toString(ihs));

        ArrayList<Integer> arrhs=convertToArrayList(hs);
        System.out.println("arrhs = " + arrhs);
    }
    public static Set<Integer> generateSet(){
        Set<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        return hs;
    }
    public static void AddElements(Set<Integer> hs,int...a){
        for (int i = 0; i<a.length ; i++) {
            hs.add(a[i]);
        }
    }//metoda giden değerler primitive yani temel değişkenkler değil ise ,yani referans değişkenler ise
    //metodda yapılan değişiklik bu değişkenin kendisinde yapıldığından main de de değişiklik aynen görülür
    public static ArrayList<Integer> convertToArrayList(Set<Integer> hs){
        ArrayList<Integer> arrlist=new ArrayList<>(hs);
        return arrlist;
    }
    public static int[] convertToArray(Set<Integer> hs){
        int[] a=new int[hs.size()];

        int i=0;
        for (int sayi:hs) {
            a[i++]=sayi;
        }
        return a;
    }
}
