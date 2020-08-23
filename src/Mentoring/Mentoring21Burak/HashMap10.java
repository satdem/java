package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap10 {
    public static void main(String[] args) {
        //todo bir satıra key ler diğer satıra value ler yazdırma
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");
        for (String key:map.keySet()) {
            System.out.print(key+" ");
        }
        System.out.println();
        for (String value:map.values()
             ) {
            System.out.print(value+" ");
        }
    }
}
