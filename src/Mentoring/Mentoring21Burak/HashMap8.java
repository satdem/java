package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap8 {
    public static void main(String[] args) {
        //todo HashMap te key ve value leri yazdırma
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");
        System.out.println("map.values() = " + map.values());
        System.out.println("map.keySet() = " + map.keySet());
    }
}
