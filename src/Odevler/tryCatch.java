package Odevler;

import java.util.Scanner;

public class tryCatch {
    /*
1- Girilen bir stringi int e çeviren bir program yazınız.
Girişler scannerla nextLine ile alınacak
Çevirme işlemini bir metod ile yapınız ve oluşabilecek hataları bir metod içinde kontrol ediniz*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        String sayi=sc.nextLine();
        
        try{
            intKontrol(sayi);
        } catch (Exception ex){
            System.out.println("ex = " + ex);
        }
        finally {
            intDonustur(sayi);
            System.out.println("sayi = " + sayi);
            System.out.println(sayi+=40);
        }
        
    }
     static int intDonustur(String s){
        
        int a=Integer.parseInt(s);
        return a;
     }
     public static void intKontrol(String s) throws Exception {
        if(s.contains(" ")){
            throw new Exception("lütfen boşluk kullanayınız");

        }
     }
}
