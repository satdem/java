package Mentoring.mentoring24Omer.Mentoring14omer;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*

todo Soru 1

 int array oluşturun.
 Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  " şeklinde bir soru sorsun.

 Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)

 ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )

 Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)

  ve            'ortadaki'              elemanı bulması için bir program yazın. (Her ihtimali düşünmeniz gerekiyor. sadece 3 elemanlı bir array için değil, 33 elemanlı bir array için de çalışmalı).

  örn:  5 elemanlı bir array

 [ 3,2,6,12,1}
 ortanca sayı = 6

 */
        Scanner sc=new Scanner(System.in);
        System.out.print("kaç elemanlı bir dizi oluşturmak istiyorsunuz:");
        int a=sc.nextInt();
        int[] dizi=new int[a];

        for(int i=0;i<a;i++){
            dizi[i]=sc.nextInt();

        }
        Arrays.sort(dizi);
        System.out.println(dizi[(a-1)/2]);//a=dizi.length eşit


    }
}
