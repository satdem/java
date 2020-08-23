package Gun10;

import java.util.Scanner;

public class JavaIf7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Girilen üç sayıdan en büyük alanı bulunuz
        System.out.println("1. sayıyı giriniz");
        int a=oku.nextInt();
        System.out.println("2. sayıyı giriniz");
        int b=oku.nextInt();
        System.out.println("3. sayıyı giriniz");
        int c=oku.nextInt();
        int enbuyuk=a;

        if(b>enbuyuk) { enbuyuk=b;}

        if(c>enbuyuk) { enbuyuk=c;}

        System.out.println("enbuyuk = " + enbuyuk);

        }
    }

