package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        //todo map i boşaltma ,silme
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");
        System.out.println(".clear dan önce map = " + map);
        map.clear();
        System.out.println(".clear dan sonra map = " + map);
        System.out.println("map.isEmpty() = " + map.isEmpty());
    }
}
