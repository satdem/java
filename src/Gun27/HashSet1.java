package Gun27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        //Array->Arraylist->Set ?
        //Set Listeleri :Collections 
        //HashSet :Kendine göre bir algoritma ile sıralyarak saklıyor.Gezinme hızlı.
        //LinkedHashSet : Kullanıcının eklemesine göre saklıyor
        //TreeSet :her veri girildiğinde tüm verileri küçükten büyüğe olacak şekilde sıralayarak saklıyor
        //Avantajı nedir:Aynı elemanı iki kez eklemiyor
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);

        //Set<Integer> hs=new HashSet<>();  şeklinde de tanımlanabilir
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(2);
        boolean eklediMi1=hs.add(2);
        boolean eklediMi2=hs.add(3);
        boolean eklediMi=hs.add(5);
        System.out.println("hs = " + hs);
        System.out.println("2 yi eklediMi = " + eklediMi1);
        System.out.println("3 ü eklediMi = " + eklediMi2);//tekrar ettiği için bunları (2 ve 3) eklemiyor
        System.out.println("5 i eklediMi = " + eklediMi);

    }
}
