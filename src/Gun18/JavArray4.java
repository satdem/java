package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class JavArray4 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 7 sayıyı bir diziye atadıktan sonra
        //ayrı bir döngü ile kaç tanesinin tek olduğunu bulunuz.
        Scanner  oku=new Scanner(System.in);
        int[] dizi=new int[7];
        int sayac=0;

        for(int i=0;i<dizi.length;i++) {
            System.out.print("diziznin " + i + ". elemanını giriniz");
            dizi[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));//diziyi yazdırıyor [1,2,3,4,5,6,7] şeklinde1

        for(int i=0;i<dizi.length;i++){
            if(dizi[i]%2==1)
                sayac++;

        } System.out.println("tek sayı adedi: "+sayac);

    }
}
