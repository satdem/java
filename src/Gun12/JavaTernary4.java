package Gun12;

import java.util.Scanner;

public class JavaTernary4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //girilen sayı 50 den büyük ise 1 küçük ise 0 yazdırın
        System.out.println("sayı giriniz:");
        int sayi=oku.nextInt();
        int a;
        a=(sayi>50)? 1:0;
        System.out.println(a);
    }
}
