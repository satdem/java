package Gun18;

import java.util.Scanner;

public class JavaArray3 {
    public static void main(String[] args) {
        //5 elemanlı bir dizi tanımlayın kullanıcıdan değerleri alarak bu diziyi doldurun.
        // sonra ortalamadan büyük eleman sayısını bulunuz
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];
        int toplam=0;
        int sayac=0;
        double ort=0;

        for(int i=0;i<dizi.length;i++){
            System.out.print("diziznin "+i+". elemanını giriniz");
            int a=oku.nextInt();
            dizi[i]=a;
            toplam+=dizi[i];
             ort=toplam/dizi.length;
        }

        System.out.println("ortalama= "+ort);

        for(int j=0;j<dizi.length;j++){
           if(dizi[j]>ort){
            sayac++;
           }
        }
        System.out.println("dizinin  " + sayac+" elemanı ortalamadan büyük");


    }
}
