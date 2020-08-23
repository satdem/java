package Gun13;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {
        //girilen bir sayının onlar basamağını yazııle yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a=oku.nextInt();

        int onlar=(a/10)%10;
        onlar=Math.abs(onlar);//sayıyı pozitife dönüştüreceği için negatiflerde hata vermez

        switch (onlar){

            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.println("iki");break;
                case 3:
                System.out.println("üç");break;
                case 4:
                System.out.println("dört");break;
                case 5:
                System.out.println("beş");break;
                case 6:
                System.out.println("altı");break;
                case 7:
                System.out.println("yedi");break;
                case 8:
                System.out.println("sekiz");break;
                case 9:
                System.out.println("dokuz");break;

            case 0:
                System.out.println("sıfır");break;
            default:
                System.out.println("hatalı sayı");//burada defaulta gerek yok ama ben yine de yazdım

        }
    }
}
