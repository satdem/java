package Mentoring.mentoring24Omer.Mentoring14omer;

import java.util.Arrays;

public class Odevomer {
    public static void main(String[] args) {
          /*

iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.
Elemanlar random atansın. (15 e kadar - 15 dahil)
2 int array'i de ekrana yazdırınız.  (1.dizi =2.dizi=        )

Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

ÖRNEK:
1.Dizi : [1,2,3,4,5]
2.Dizi : [4,5,6,7,8]

ortak eleman: 4     ortak eleman: 5

    // TODO: 1  İpucu :

           Ortak eleman ararken oluşturacağınız koşula int count ekleyin. (int count = 0;)
Eğer ortak eleman varsa count++.
Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */
        int[] a=new int[5];
        int[] b=new int[5];

        for(int i=0;i<a.length;i++){
            int random=(int)((Math.random()*15)+1);
            a[i]=random;
        }

        for(int i=0;i<b.length;i++){
            int random=(int)((Math.random()*15)+1);
            b[i]=random;
        }
        System.out.println("(a) = " + Arrays.toString(a));
        System.out.println("(b) = " + Arrays.toString(b));
        int count=0;
        for(int i=0;i<5;i++){
            if(a[i]==b[i]){
                System.out.println("Ortak eleman: "+a[i]);
                count++;
            }

        }
        if(count==0) System.out.println("Ortak eleman yok");




    }
}
