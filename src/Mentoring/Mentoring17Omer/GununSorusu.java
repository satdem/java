package Mentoring.Mentoring17Omer;

import java.util.ArrayList;

import java.util.Collections;


public class GununSorusu {
    /*
İki adet Integer ArrayList  ( a ve b)    oluşturun.   İkisi de 6 elemandan oluşmalı.
 (int arraylist a   ve     int arraylist   b )

RandomEkleVeOrtakElemaniBul isminde bir void method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.
Eğer ortak eleman varsa, bu ortak elemanları "Arraylist ortak" isminde başka bir arrayliste gönderin.
Ve "sadece ortak eleman varsa" bu arraylisti yazdırın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.



OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  eğer a ve b arasında ortak elemanlar varsa  a'dan b'deki elemanları çıkartsın.
(Ortak elemanları cıkartsın)
ve a 'nın yeni halini (b 'den arınmış halini) konsola yazınız.
Eğer ortak elemanları yoksa hiçbir şey yazmasın.

Ve bu iki methodu main methodunda çağırın.


Konsol örneklerini dikkatlice inceleyin..

        todo Konsol şöyle olmalı     (Eğer ortak eleman varsa):
a  ilk hali :     [8, 24, 33, 35, 36, 43]
b ilk hali  :    [4, 14, 17, 36, 43, 44]

Ortak elemanlı yeni array: [36, 43]

Ortak olanları çıkardıktan sonra Arraylist a :  [8, 24, 33, 35]


todo Konsol şöyle olmalı (Eğer ortak elemanları yoksa);

a  ilk hali :     [17, 30, 30, 39, 46, 47]
b ilk hali  :    [11, 25, 25, 26, 28, 44]
Ortak eleman yoktur ...
*/
    public static void RandomEkle(ArrayList<Integer> a){
        a.add((int)(Math.random()*50));
        a.add((int)(Math.random()*50));
        a.add((int)(Math.random()*50));
        a.add((int)(Math.random()*50));
        a.add((int)(Math.random()*50));
        a.add((int)(Math.random()*50));
        Collections.sort(a);
    System.out.println(a);

    }
    public static ArrayList<Integer> ortakElemanBul(ArrayList<Integer> a,ArrayList<Integer> b){
        ArrayList<Integer> ortakEleman=new ArrayList<>();
        for (int i = 0; i < 6; i++) {

        if(a.contains(b.get(i)))
            ortakEleman.add(b.get(i));
        }
        //System.out.println("ortakEleman = " + ortakEleman);

         return ortakEleman;
    }
    public static void OrtakElemanlariKaldir(ArrayList<Integer> a,ArrayList<Integer> b){
        ArrayList<Integer> oe=ortakElemanBul(a,b);
        if(oe.isEmpty()) {
            System.out.println("Ortak eleman yoktur.");
        }else {a.removeAll(b);
        System.out.println("ortak elemanları kaldır"+a);}
    }

    public static void main(String[] args){
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        RandomEkle(x);
        RandomEkle(y);
        ortakElemanBul(x,y);
        System.out.println("ortak elemanlar: "+ortakElemanBul(x,y));
        OrtakElemanlariKaldir(x,y);
    }


}

