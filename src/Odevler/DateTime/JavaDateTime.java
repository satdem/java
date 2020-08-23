package Odevler.DateTime;

import java.util.ArrayList;

public class JavaDateTime {
   /* Haftanın Sorusu: Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak ekleyen
    ve sonrasında her dakikanın ilk 10 saniyesinde kaydolmuş olanları şanslı
    kullanıcı olarak ekrana yazdıran bir uygulamadır.Bunun için;
1- Bir user class oluşturun fieds: name , registerDate (LocalDateTime cinsinden)
2- Registration isminde bir class oluşturun ve register isminde bir metod ekleyerek
            Kullanıcıdan user ismini alarak ArrayList e ekleyinve bu list i return edin.
3- Registration clası na aynı zamanda kendine verilen ArrayListteki userlardan
    her dakikanın ilk 10 saniyesinde kaydolmuşları yazdıran printHappyUsers isminde
    bir metod daha ekleyiniz.


    İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.*/
    public static void main(String[] args) {

        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
        userReg.printHappyUsers(register);

    }

}
