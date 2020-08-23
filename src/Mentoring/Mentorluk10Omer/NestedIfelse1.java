package Mentoring.Mentorluk10Omer;

import java.util.Scanner;

public class NestedIfelse1 {
    public static void main(String[] args) {
        /*
            hava durumu ile ilgili sistem size "derece giriniz" sorusunu sorsun.

        int derece oluşturarak bir değer giriniz.

        havanın güneşli olup olmadıgını belirlemek için de         boolean sunny               oluşturunuz.

        eğer derece 40 tan fazla ise    "dışarısı çok sıcak!" yazsın ve eğer güneşli ise  (boolean=true ise)  ,   " ayn ı zamanda güneşli ! " yazsın.

        güneşli değil ise (boolean? false ise)       ,      "ve bulutlu "  yazsın.


        40 dereceden düşük ise dışarısı sıcak değil yazsın.

         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen dereceyi giriniz:");
        int sayi=sc.nextInt();

        if(sayi>=40){
            boolean sunny=sc.nextBoolean();
            System.out.println("dışarısı çok sıcak!");
         if(sunny==true){

             System.out.println("aynı zamanda güneşli");


         }else System.out.println("ve bulutlu " );
        }else System.out.println("dışarısı sıcak değil");

    }
}
