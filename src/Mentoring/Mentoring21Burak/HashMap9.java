package Mentoring.Mentoring21Burak;

import java.util.HashMap;
import java.util.Map;

public class HashMap9 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");

        System.out.println("map = " + map.values());

        for (Map.Entry<String,String> entry:map.entrySet()) {
            String value=entry.getValue();
            System.out.println("value = " + value);
        }

    }
}
