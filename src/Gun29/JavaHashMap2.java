package Gun29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class JavaHashMap2 {
    public static void main(String[] args) {
        Map<String,String> userMap=new HashMap<>();
        userMap.put("name","Ahmet Zan");
        userMap.put("email","ahmetéhotmail.com");
        userMap.put("adres","Şişli/İstanbul");
        userMap.put("mobilTel","0 505 267 9405");

        System.out.println("userMap.get(\"name\") = " + userMap.get("name"));
        System.out.println("userMap.get(\"adres\") = " + userMap.get("adres"));

        Map<String,String> userMap2=new HashMap<>();
        userMap2.put("name","Ayşe Zan");
        userMap2.put("email","ayseéhotmail.com");
        userMap2.put("adres","Pendik/İstanbul");
        userMap2.put("mobilTel","0 535 267 9405");

        System.out.println("userMap.get(\"name\") = " + userMap2.get("name"));
        System.out.println("userMap.get(\"adres\") = " + userMap2.get("adres"));

        Map<String,Map<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("Ahmet",userMap);
        kartvizitler.put("Ayşe",userMap2);
        System.out.println("kartvizit = " + kartvizitler);
        
        String ahmetadres=kartvizitler.get("Ahmet").get("adres");
        System.out.println("ahmetadres = " + ahmetadres);

        System.out.println("Ayşenin tel nosu = " + kartvizitler.get("Ayşe").get("mobilTel"));



    }
}
