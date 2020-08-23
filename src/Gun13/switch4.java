package Gun13;

import java.util.Scanner;

public class switch4 {

    public static void main(String[] args) {
        //kullanıcının girdiği sayıya karşılık gelen gün adını yazınız
        Scanner oku=new Scanner(System.in);
        System.out.print("gün sayısını giriniz: ");
        int gunNo=oku.nextInt();
        switch(gunNo)
        {

            case 1: System.out.println("Pazartesi"); break;//break işlemi sonlandırıyor.
            case 2: System.out.println("Salı"); break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5://gunNo 5 e eşitse demek
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default://hiç biri uymazsa bu kısım işleme girer
                System.out.println("Hatalı gün no");
        }



    }
}
