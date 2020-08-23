package Mentoring.mentoring24Omer.Mentoring14omer;

import java.util.Arrays;

public class Array_method {
    public static void main(String[] args) {
        // todo ...... Arrays.toString() metodu..........

        System.out.println("  \n-----1. Array.toString() metodu------\n");

        // diziyi konsola "dizi şeklinde" yazdırır

        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        //todo     ........Arrays.fill metodu.......

        int[] liste={1,12,3,4,7,10};
        System.out.println("Arrayın ilk hali: "+Arrays.toString(liste));
        Arrays.fill(liste,4);
        System.out.println("Arrayın son hali: "+Arrays.toString(liste));

        //****değiştirilecek değerin hangi aralıkta olduğunu belirleyebiliriz*****

        Arrays.fill(liste,0,4,99);//fill(intfrom dan)
        System.out.println("Arrayın enson hali: "+Arrays.toString(liste));

        //todo .........Arrays.sort..................
        // Array in elemanlarının küçükten büyüğe sıralanması yada alfabetik sıraya sokar
        int[] b={88,77,25,66,32,22,3};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //belli bir aralığı sıralamamızı sağlar
        Arrays.sort(b,0,3);//fromindex ten
        System.out.println(Arrays.toString(b));

        String[] dizi={"a","g","d","z","i"};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        //todo ............Arrays.equals() metodu...........
        // diziler birebir aynımı onu gösterir: aynı ise true değilse false

        String[] x={"techno","study","avrupa"};
        String[] y={"study","techno","avrupa"};
        String[] z={"techno","study","avrupa"};
        System.out.println(Arrays.equals(x,y));
        System.out.println(Arrays.equals(x,z));

        //todo .........Arrays.binarySearch.........
        // sıralanmış bir dizide bir değer varmı yok mu onu araştırır.
        // varsa index ini verir yoksa - değer döndürür

        int[] d={22,5,7,66,14,1};
        Arrays.sort(d);
       int degisken= Arrays.binarySearch(d,7);
        System.out.println(degisken);
    }
}
