package Gun23;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMetod7 {
    public static int[] teklereSifirAta(int[] d){
        for (int i = 0; i <d.length ; i++) {
            if(d[i]%2==1) d[i]=0;

        }

        return  d;
    }
    public static void main(String[] args) {
        //5 elemanlı bir diziyi kullanıcı doldurduktan sonra
        //bir fonksiyonda tek elemanlılara 0 değeri atayınız
        //diziyi main de yazdırınız
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.print("bir sayı giriniz: ");
            dizi[i]=oku.nextInt();

        }
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(teklereSifirAta(dizi)));
    }
}
