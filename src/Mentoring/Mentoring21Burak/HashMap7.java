package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap7 {
    public static void main(String[] args) {
        //todo HashMap.get Spesifik bir Key i elde etmemize yarıyor.
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");
        System.out.println("Amazonda Ipad ne kadar = " + map.get("Amazon"));
    }
}
