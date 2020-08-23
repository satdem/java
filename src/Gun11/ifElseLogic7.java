package Gun11;

import java.util.Scanner;

public class ifElseLogic7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //bir otoparkücret hesaplama programı yapılmak isteniyor
        //0-2 arası 5 tl,2-5 arası 10 tl,5 saatten sonra 15 tl
        System.out.println("süreyi giriniz");
        double a=oku.nextDouble();
        if(a<=2) System.out.println("ücret: 5tl");
        else if(a<=5 ) System.out.println("ücret: 10 tl");//ifin içine a>2 yazmaya gerek yok çünkü önceki if te onu kontrol etik.
        else System.out.println("ücret: 15 tl");

    }
}
