package Gun11;

import java.util.Scanner;

public class ifElseLogic8 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Girilen iki sayıyı kullanıcıdan aldıktan sonra toplama içinT, çıkarma için Ç,çarpma içinP,
        //bölme için B harflerini alarak isteğe uygun olarak yazdırın
        System.out.println("1. sayıyı giriniz:");
        int a=oku.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int b=oku.nextInt();
        oku.nextLine();//int den sonra string gireceğim için bunu yapmam lazım.

        System.out.println("hangi işlemi yapmak istersiniz?\n1.toplama için T\n2. çıkarma için Ç\n3. çarpma için P\n4.bölme için B   yazınız" );
        String c=oku.next();

        if(c.equals("T")) System.out.println("toplam= "+(a+b));
        else if(c.equals("Ç")) System.out.println("çıkarma= "+(a-b));
        else if(c.equals("P")) System.out.println("çarpma= "+(a*b));
        else if(c.equals("B")) System.out.println("bölme= "+(a/b));
    }
}
