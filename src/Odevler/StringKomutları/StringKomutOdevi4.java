package Odevler.StringKomutları;

import java.util.Scanner;

public class StringKomutOdevi4 {


    public static void main(String[] args) {
       // 4- Kullanıcdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını , büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız
      Scanner sc=new Scanner(System.in);
        System.out.print("Şifrenizi yazınız:");
        String password=sc.nextLine();
        String festpass="saaDET123";
        boolean bool=password.equalsIgnoreCase(festpass);
        System.out.println("şifreniz: " +bool);



    }
}