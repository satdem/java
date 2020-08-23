package Gun12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mathmethodsoru6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int a=oku.nextInt();
        System.out.println("2. sayıyı giriniz");
        int b=oku.nextInt();
        System.out.println("3. sayıyı giriniz");
        int c=oku.nextInt();
         int max=Math.max(a,b);
         max =Math.max(max,c);
        System.out.println("max = " + max);

        System.out.println("max= "+Math.max (Math.max(a,b),c));//yukarıdakiler yerine bu şeklde kısaca yapabilirim
    }
}
