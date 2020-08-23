package Odevler.Switch;

import java.util.Scanner;

public class switchodev1 {
    public static void main(String[] args) {
        //1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız
        Scanner sc=new Scanner(System.in);
        System.out.print("Günü Seçiniz: \nPazartesi için:1\nSalı      için:2\nÇarşamba  için:3\nPerşembe  için:4\nCuma      için:5" +
                "\nCumartesi için:6\nPazar     için:7\n tuşlayınız: ");
        int a=sc.nextInt();
        int d=(a+100)%7;


        switch (a){
            case 1: System.out.println("100 gün sonra Çarşamba");break;
            case 2: System.out.println("100 gün sonra Perşembe");break;
            case 3: System.out.println("100 gün sonra Cuma");break;
            case 4: System.out.println("100 gün sonra Cumartesi");break;
            case 5: System.out.println("100 gün sonra Pazar");break;
            case 6: System.out.println("100 gün sonra Pazartesi");break;
            case 7: System.out.println("100 gün sonra Salı");break;
            default:
                System.out.println("Yanlış tuşlama yaptınız.");
        }

    }
}
