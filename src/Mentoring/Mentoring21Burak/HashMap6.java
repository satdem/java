package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap6 {
    public static void main(String[] args) {
        //todo HashMap.containsValue
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");
        String value="301";
        if(map.containsValue(value)){
            System.out.println("Bu fiyattan bir satıcı bulundu.");
        }else System.out.println("Bu fiyattan bir satıcı bulunamadı..");
        System.out.println("296 Euroya Ipad var mı:"+map.containsValue("296 Euro"));

    }
}
