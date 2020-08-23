package Gun7;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        //kullanıcıdan tek seferde alınan ad ve soyadının ilk harflerini kısaltma şeklinde yazdırın
        //Satı Demirci s. d.gibi

        Scanner sc=new Scanner(System.in);
        System.out.print("Adınız ve soyadınız:" );
        String str=sc.nextLine();

        char a=str.charAt(0) ;
        int i=str.indexOf(" ");
        char b=str.charAt(i+1);
        System.out.println(" adınız ve soyadınız: " +str+" "+a+". "+b+".");

    }
}

