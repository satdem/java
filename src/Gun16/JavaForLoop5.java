package Gun16;

import java.util.Scanner;

public class JavaForLoop5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //girilen stringteki a harfi sayısını bulunuz. c harfine sıra gelirse döngüden çıkılsın.
        System.out.print("Bir string giriniz:");
        String str=oku.nextLine();
        int a=str.length();
        int asayisi=0;
        for(int i=0;i<a;i++){
            char c=str.charAt(i);
            if(c=='a') asayisi++;
            else if(c=='c') break;
            System.out.println("döngü içersinde işleme giren harfler = " + c);
        }
        System.out.println("a sayısı= "+ asayisi);
    }
}

