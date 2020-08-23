package Mentoring.Mentoring22Tahir;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap3 {
    /*10,Java
    2,Python
    20,PHP
    57,C++
    89,C#
    40,Javascript
     */
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        Map<Integer,String> lhm=new LinkedHashMap<>();
        Map<Integer,String> tm=new TreeMap<>();
        printMap(hm);
        printMap(lhm);
        printMap(tm);
    }
    public static void printMap(Map<Integer,String> map){

        map.put(10,"Java");
        map.put(20,"PHP");
        map.put(2,"Python");
        map.put(57,"C++");
        map.put(89,"C#");
        map.put(40,"JavaScript");
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());

        }
        System.out.println("***************************************");

    }
}
