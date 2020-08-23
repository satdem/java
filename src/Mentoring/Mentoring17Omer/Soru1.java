package Mentoring.Mentoring17Omer;

import java.util.ArrayList;
import java.util.Collections;

public class Soru1 {
    public static void reverse(ArrayList<String> ulke){
        Collections.reverse(ulke);
        System.out.println(ulke);


    }
    public static void main(String[] args) {
        /*

String arrayList oluşturun.

İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.

reverse   adında  void bir method oluşturun ve parametresi   String arrayList olsun.

Bu method, arrayListteki değerleri tersten sıralasın ve yazdırsın.

methodu çağırın.

Konsoldaki görüntü böyle olmalı:


ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]

 */
        ArrayList<String> arryl=new ArrayList<>();
        arryl.add("Almanya");
        arryl.add("Italya");
        arryl.add("Türkiye");
        arryl.add("Yunanaistan");
        arryl.add("Kanada");
        System.out.println("ilk hali: "+(arryl));
        reverse(arryl);

    }
}
