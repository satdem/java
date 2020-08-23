package Mentoring.Mentoring22Tahir;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOdev {
    public static void main(String[] args) {
        //Todo treemap kullanarak bir cümlenin içindeki harfkerin frekansını bulunuz metod kullanarak yapınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence=scan.nextLine();

        frekansBul(sentence);
    }
    public static void frekansBul(String str){
        Map<Character,Integer> frekans=new TreeMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);
            }
            else frekans.put(c,1);
        }
        for (Map.Entry<Character,Integer> entry:frekans.entrySet()) {
            System.out.println("Karakter "+entry.getKey()+" "+entry.getValue()+" kadar var");
        }
    }
}
