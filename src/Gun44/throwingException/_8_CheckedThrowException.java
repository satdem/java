package Gun44.throwingException;

import java.io.IOException;
import java.util.Scanner;

public class _8_CheckedThrowException {
    //Kullanıcıdan hava sıcaklığını isteyiniz
    //ayrı bir methodda bunun kontrolünü yaparak ,
    // hava sıcaklığı 10 dan küçük ise IOexception hatası oluşturunuz
    //main den çağırarak hatayı kontrol ediniz

    public static void SicaklikKOntrol(int sicaklik) throws IOException {
                                               //bunu eklemek zorundayız.Bu,bu metodun bir hata ürettiğini gösteriyor
                                               //metodun içinde Chacked Theow var demek
        // Eğer bir metod içerisinde Checked Throw var ise, metoda adına hata işareti
        // eklenmeden derlenmesine izin verilmez.Hata çizgisini üzerine gelindiğinde Add ...
        // a tıklandığınd aototmatik ekleyecektir.Bu şekidle bu metodu çağıran yerlerin try catch e
        // alınması garantiye alınmış olur.
        if(sicaklik<10){
            throw new IOException("hava gerçekten soğuk, dışarı çıkma");//checked(kontrol) olması için bu hata türü seçildi
        }
        System.out.println("Dışarıda basketbol oynayabilirsin");
    }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("HavaSıcaklığı: ");
        int sicaklik=oku.nextInt();

        try {
            SicaklikKOntrol(sicaklik);
        }catch (Exception ex){
            System.out.println("ex = " + ex);//hata mesajını göster diyoruz,throw ile oluşturulan hata mesajını
        }


    }
}
