package Mentoring.Mentoring21Burak;

import java.util.HashMap;
import java.util.Map;

public class HashMap11 {
    public static void main(String[] args) {

        //todo hashMap valuelerini toplama
    HashMap<String,Integer> map=new HashMap<>();
        map.put("Amazon",     296);
        map.put("Ebay",       278);
        map.put("Saturn",     300);
        map.put("MediaMarkt", 310);
        map.put("Apple Store",340);
        int toplam=0;
        for (Map.Entry<String,Integer> sum:map.entrySet()
             ) {
            int fiyat=sum.getValue();
            toplam+=fiyat;
        }
        System.out.println("fiyatların toplamı = " + toplam);
    }
}
