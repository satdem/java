package Mentoring.Mentoring22Tahir;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        //TODO
        //HashMap<String,String> hm=new LinkedHashMap<>(); hashmap referanslı linkedhashmap
        LinkedHashMap<String,Integer> cauntry=new LinkedHashMap<>();
        //todo 5 ilke ve ismini oluşturun
        cauntry.put("Türkiye",83000000);
        cauntry.put("Almanya",83000000);
        cauntry.put("Fıransa",65000000);
        cauntry.put("İtalya",60000000);
        cauntry.put("İspanya",46000000);
        cauntry.put(null,1000000);// linkedhashmapen bu şeklinde bir özelliği de var

        System.out.println("cauntry = " + cauntry);
        for (Map.Entry<String,Integer> ulke:cauntry.entrySet()) {
            System.out.println("ulke = " + ulke);
        }
        System.out.println("cauntry.keySet() = " + cauntry.keySet());
        System.out.println("cauntry.keySet() = " + cauntry.values());
        
        int toplam=0;
        for (Integer a:cauntry.values()) {
          toplam+=a; 
        }
        System.out.println("toplam = " + toplam);
        // 2. YOL ülke nüfuslar toplamı
       /* int sum=0;
        for (Map.Entry<String,Integer> nufus : lhm.entrySet() ) {

            sum+=nufus.getValue();
        }
        System.out.println("Toplam nüfus = " + sum );*/

        int sayac=0;
        for (Integer a:cauntry.values()) {
            if(a<50000000) sayac++;
        }
        System.out.println("50 milyondan aznüfusu olan ülke sayısı = " + sayac);
       // 2.YOL 50 milyondan az ülke sayısı
       int count=0;
        for (Map.Entry<String,Integer> syc:cauntry.entrySet()) {
            if(syc.getValue()<50000000) {
                count++;
                System.out.println("nüfusu 50 milyon altında olan ülke: " + syc.getKey());
            }
        }
        System.out.println("50 milyondan aznüfusu olan ülke sayısı = " + count);

        //todo 50000000=50_000_000 şeklindede yazılabilir
    }
}
