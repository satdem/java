package Mentoring.Mentoring20Zeynep;

import java.util.HashSet;
import java.util.Set;

public class Deneme2 {
    /*main method altinda bos bir hashset olusturunuz.

    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method yaziniz (return tipi olmayacak)

    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.*/
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        int[] dizi=new int[]{1,2,3,4,7};
        elemanekle(set,dizi);
        icindekiler(set);

    }
    public static void icindekiler(Set<Integer> set){
        System.out.println(set);
    }

    public static void elemanekle(Set<Integer> iset,int[] arr){

        for (int i = 0; i < arr.length; i++) {
            iset.add(arr[i]);

        }
    }
}
