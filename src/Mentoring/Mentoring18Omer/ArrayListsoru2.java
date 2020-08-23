package Mentoring.Mentoring18Omer;

import java.util.ArrayList;

public class ArrayListsoru2 {
    /*
Int arrayList oluşturun. 10 elemandan oluşmalı.
Random ekle isminde void bir method oluşturun ve parametresi int ArrayList olsun.

//todo Methodun içinde,
bu method, Arraylistin içine 0'dan 20 ye kadar random değer atasın.
Eğer çift sayı atarsa, o elemanın yerine 111 yazsın.
Eğer çift sayı yoksa "Çift sayı yoktur " mesajını versin.
     */
    public static void RandomEkle(ArrayList<Integer> r){
        for (int i = 0; i <10 ; i++) {
            r.add((int)(Math.random()*20+1));

        }
        System.out.println("dizinin ilk hali:"+r);
        int count=0;
        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i)%2==0){
                count++;
                r.set(i,111);
            }
        }

        if(count==0) System.out.println("Çift sayı yoktur");
        System.out.println("Dizimizin son hali: "+r);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        RandomEkle(a);
    }
}
