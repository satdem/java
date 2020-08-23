package Repl_it.methods;

import java.util.Arrays;

public class metod7 {/*plusOne adında bir method oluşturun.

Parametre olarak int alır.

Rakamlar pozitif olmalıdır ve ilk basamak 0 olamaz.

Yazdığınız rakamlar bir bütün olarak ele alınacaktır.

Orta basamağa 1 ekleyin.


Örnek 1:
Girdi:: [1,2,3]
Çıktı: [1,3,3]
Açıklama:Bu sayı dizisi 133'ü temsil eder.

Örnek 2:
Input: [4,3,5,2,1]
Çıktı: [4,3,6,2,1]
Açıklama: Bu sayı dizisi 43621'i temsil eder.*/
    public static int[] plusOne(int a[]) {
       /* int x=1,y=1;
        while (a/x>9)
        {   x=x*10;
            y++;
        }
        a+=Math.pow(10,(y-1)/2);
        String sa=String.valueOf(a);
        String[] sad=sa.split("");
        int[] id=new int[sad.length];
        for(int i=0;i<sad.length;i++){
            id[i]=Integer.parseInt(sad[i]);}
        return id;*/
        int[] yeni=new int[a.length];
        for (int i = 0; i <yeni.length ; i++) {
            if(i==(yeni.length-1)/2)
                yeni[i]=a[i]+1;
            else yeni[i]=a[i];

        }

    return yeni;

    }

    public static void main(String[] args) {
        int[] sayi={1,2,3};
        int[] sayi2={4,2,5,3,1};
        System.out.println("sayi sonra = " + Arrays.toString(plusOne(sayi)));
        System.out.println("sayi2 sonra = " + Arrays.toString(plusOne(sayi2)));
    }

}
