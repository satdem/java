package Gun12;

import java.util.Scanner;

public class JavaRandom9 {
    public static void main(String[] args) {
        //kullanıcıdan alt ve üst değeri isteyerek random sayı üretin
        //üretilen sayıyı yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.println("üst sınır sayıyı giriniz: ");
        int a=oku.nextInt();
        System.out.println("alt sınır sayıyı giriniz: ");
        int b=oku.nextInt();

        int sayi=(int)(Math.random()*((a-b)+1)+b);
        System.out.println("rastgele sayi = " + sayi);
    }
}
