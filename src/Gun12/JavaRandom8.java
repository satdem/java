package Gun12;

import java.util.Scanner;

public class JavaRandom8 {
    public static void main(String[] args) {
        //girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışın
        //kullanıcı bilirse tebrikler yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.println("kaça kadar tahmin etmek için sayı giriniz: ");
        int a=oku.nextInt();

        System.out.println(" verdiğiniz aralıkta bir sayı tahmin ediniz:");
        int tahmin=oku.nextInt();

        int rastgele=(int)(Math.random()*a+1);
        System.out.println("rastgele = " + rastgele);

        if(tahmin==rastgele) System.out.println("tebrikler");
        else System.out.println("bilemedinki bilemedinki");
    }
}
