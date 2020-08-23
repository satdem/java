package Gun18;

import java.util.Arrays;

public class JavaArray5 {
    public static void main(String[] args) {
        //5 eemanlı bir dizitanımlayın. 10 kadar olan sayılardan random atayarak doldurunuz .
        //ve elemanları ekrana 3 farklı şekilde yazdırın
        int[] dizi=new int[5];

        ;
        for(int i=0;i<dizi.length;i++){
            dizi[i]=(int)(Math.random()*10);
        }
         for(int i=0;i<dizi.length;i++){  //dizi yazdırma da 1. yol
             System.out.println("dizi[i] = " + dizi[i]);
         }
        System.out.println(Arrays.toString(dizi));//2. yol

        // Ekrana yazdırma 3.Yöntem : Dizi değişkeninin içindeki elemanları deger adını vererek
        // döngüye gönderiyor.
        for (int deger: dizi ) {
            System.out.println("deger = " + deger);
        }

        for(int eleman : dizi){
            System.out.println("eleman = " + eleman);
        }
    }
}
