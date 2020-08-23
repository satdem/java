package Mentoring.Mentoring21Burak;

import java.util.HashMap;

public class HashMap5 {
    //todo HashMap.containsKey matodu
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Amazon",     "296 Euro");
        map.put("Ebay",       "278 Euro");
        map.put("Saturn",     "300 Euro");
        map.put("MediaMarkt", "310 Euro");
        map.put("Apple Store","340 Euro");

        String key="Aldi";
        if(map.containsKey(key)){
            System.out.println("değer(value)"+map.get(key));

        }else{
            System.out.println( "Bu map'de bunun ile alakalı bir şey yok.");
        }
        System.out.println("Amazonda Ipad satılıyor mu:"+map.containsKey("Amazon"));
    }
}
