package Gun43.JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _4_JavaTryCatch {
    public static void main(String[] args) {

        try {//dene demek hatanın başladığı yerin üstüne  yazılır.
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println("işlem tamam");//hata olursa burayı atlıyor,//hata olmazsa burayı yazıyor
        }//hatanın bittiği yerde parantez kapatılır

        catch (Exception hata){//hata olduğunda yapılacak şeyler bu parantezler arasına yazılır.
            //System.out.println("hata oldu");// hata olursa burayı da yazıyor//hata olmazsa burayı atlıyor
            //System.out.println(" Hata = tarih dönüşüm hatası");// hata olursa burayı da yazıyor//hata olmazsa burayı da atlıyor

            System.out.println("hata.getMessage() = " + hata.getMessage());//hatayı verir
            hata.printStackTrace();//bütün kırmızı yazıları veriyor,hatanın geçtiği aşamalar.
        }
        System.out.println("programın sonuna gelindi");// hata olursa burayı da yazıyor//hata olmazsa burayıda  yazıyor

    }
}
