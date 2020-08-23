package Mentoring.Mentorluk13Burak;

import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {
        //TODO Scanner ile Array elemanlarını girme

        Scanner sc=new Scanner(System.in);

        int[] Elma=new int[5];
        System.out.println("Array in elemanlarını giriniz:");
        for(int i=0;i<Elma.length;i++){
            Elma[i]=sc.nextInt();
        }
        System.out.println("Array in değerleri yazdırılıyor:");
        for(int i=0;i<Elma.length;i++){
            System.out.println("Eleman = " + Elma[i]);
        }

            //Arrayın elemanlarının ortlamasını alma
            int toplam=0;
            for(int i=0;i<Elma.length;i++){
                toplam+=Elma[i];
            }
            int ortalama=toplam/Elma.length;
        System.out.println("ortalama = " + ortalama);

    }
}
