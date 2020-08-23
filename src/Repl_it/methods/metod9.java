package Repl_it.methods;

public class metod9 {
    /*findTheDifference isminde bir method oluşturun.

iki String'den oluşmalı.
return  veri tipi char olmalı.
Bu iki string'e  s  ve t  ismini veriniz ve küçük harflerden oluşan değerler giriniz.
String t, rastgele karıştırma dizgileri String s tarafından oluşturulur
ve daha sonra rastgele bir konuma bir harf daha ekler. String t ye  eklenen harfi bulun.
(String s 'te olup, String t 'de olmayan elemanı yazdırın.)
Örn:
Girdi:
s = "abcde"
t = "abcd"

Çıktı:
e
Açıklama:
'e' harfi eklenmiştir.

s = "qawer"
t = "rewq"
Çıktı:
a

Açıklama:
'a' harfi eklenmiştir.
*/
    public static char findTheDifference(String s, String t){
        String[] sarr=s.split("");
        String [] tarr=t.split("");

        char tekrarsiz=' ';
        for (int i = 0; i <sarr.length ; i++) {
            int sayac=0;
            for (int j = 0; j <tarr.length ; j++) {
                if (sarr[i].equals(tarr[j])) sayac++;
            }
            if(sayac==0) tekrarsiz= sarr[i].charAt(0);
        }
        return tekrarsiz;
    }

    public static void main(String[] args) {
        String s="qawer";
        String t="rewq";
        char a=findTheDifference(s,t);
        System.out.println("eklenen = " + a);
    }

}
