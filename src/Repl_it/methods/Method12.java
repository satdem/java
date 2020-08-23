package Repl_it.methods;

public class Method12 {
    /*
powerOfThree isminde bir method oluşturun.

Parametre olarak int


Return tipi boolean
Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
Örnek 1:
Girdi: 27
Çıktı: true
Açıklama: 3*3*3 =27
Sonuç= true

Örnek 2:
Girdi: 0
Çıktı: false
Örnek 3:
Girdi: 9
Çıktı: true
Açıklama: 3*3 = 9
Sonuç= true
Örnek 4:
Girdi: 45
Çıktı:: false
Açıklama: 3*3*3*3 =81
Sonuç= false
45, 3ün üssü (kuvveti) değildir.*/

    public static boolean powerOfThree(int a){
        boolean b=false;
        int carpim=1;
        for (int i = 0; i < a; i++) {
            carpim=carpim*3;
            if (a==carpim){
                b=true;
                break;
            }

        }
        return b;
    }

    public static void main(String[] args) {
        int a=27;
        System.out.println("powerOfThree(a) = " + powerOfThree(a));
    }
}
