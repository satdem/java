package Repl_it.Repl_itCollections;

import java.util.Scanner;

public class primeNumber {
    /*negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.
Örnek 1:
n = 20
cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
Örnek2:
Input(Girdi): 10
Output(Çıktı): 4
Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz");
        int a=sc.nextInt();
        int s=0;
        for (int i = 2; i <=a ; i++) {

            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    s++;break;
                }
            }

        }
        System.out.println(a-s-1);
    }
}
