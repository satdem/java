package Gun14;

import java.util.Scanner;

public class DoWhile9 {
    public static void main(String[] args) {
        //kullanıcıdan x harfi girene kadar "ekrana program çalışıyor " yazan
        //ve x girildiğinde ise program bitti yazazdırınız

        Scanner oku=new Scanner(System.in);
        String s=" ";
        do{

            System.out.print("bir harf giriniz:");
            s=oku.nextLine();
            if(s.equalsIgnoreCase("x"))break;//döngü kırıcık
            System.out.println("program çalışıyor");

        } while (!s.equalsIgnoreCase("x"));
        System.out.println("program bitti ");
    }
}

