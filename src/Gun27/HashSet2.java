package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");//tekrar olduğu için eklemedi
        hs.add("red");
        hs.add("rED");
        //1. YoL
        System.out.println("hs = " + hs);
        
        //2.YOL
        for (String s:hs){
            System.out.println("s = " + s);
        }

        //3. YOL  bu daha hızlı çalışıyor.
        Iterator gosterge=hs.iterator();
        while (gosterge.hasNext())//hasNext sonraki vasa demek
        {
            System.out.println("sonraki eleman = " + gosterge.next());
            //gosterge.remove();//o anda gösterdiği elemanı silebiliyor bu kısmı diğer yöntemlerden farklı
        }

        hs.remove("Red");//bir eleman siler
        System.out.println("hs = " + hs);
        hs.clear(); //set i tamamen siler
        System.out.println("hs = " + hs);
    }
}

