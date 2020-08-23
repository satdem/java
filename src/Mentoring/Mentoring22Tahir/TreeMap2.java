package Mentoring.Mentoring22Tahir;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<Integer, String>();
        Map<Integer,String> lhm=new LinkedHashMap<Integer, String>();
        Map<Integer,String> tm=new TreeMap<>();
        hm.put(10,"Java");
        hm.put(20,"PHP");
        hm.put(2,"Python");
        hm.put(57,"c++");
        hm.put(10,"Java");
        hm.put(40,"JavaScript");
        for (Map.Entry<Integer,String> entry :hm.entrySet()) {
            System.out.println("keys "+entry.getKey()+"value "+entry.getValue());
        }
        System.out.println("***************************************");


        lhm.put(10,"Java");
        lhm.put(20,"PHP");
        lhm.put(2,"Python");
        lhm.put(57,"C++");
        lhm.put(89,"C#");
        lhm.put(40,"JavaScript");


        for (Map.Entry<Integer,String>entry:lhm.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("**************************************");


        tm.put(10,"Java");
        tm.put(20,"PHP");
        tm.put(2,"Python");
        tm.put(57,"C++");
        tm.put(89,"C#");
        tm.put(40,"JavaScript");
        for (Map.Entry<Integer,String>entry:tm.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("**************************************");

    }
}

