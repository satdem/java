package Gun22;

import java.util.Scanner;

public class JavaMethods5 {
    public static  void toplamYaz(int a,int b){

        System.out.println("toplam= "+(a+b));

    }
    public static  void cikarmaYaz(int a,int b){
        System.out.println("fark= "+(a-b));

    }
    public static  void carpmaYaz(int a,int b){
        System.out.println("çarpma= "+(a*b));

    }
    public static  void bolmeYaz(int a,int b){
        System.out.println("bolme= "+(a/b));

    }
    public static  void faktoriyelYaz(int a){
        int fak=1;
        for (int i = 1; i <=a ; i++) {
            fak*=i;

        }
        System.out.println("faktoriyel= "+(fak));

    }
    public static void menuYaz(){
        System.out.println("********menü***********");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma ");
        System.out.println("4. Bölme");
        System.out.println("5. Faktöriyel alma");
        System.out.println("6. Çıkış");
        System.out.print("Seçiminiz= ");

    }
    public static void secimYap(int secim){
        Scanner oku=new Scanner(System.in);
        int s1=0;
        int s2=0;

        switch (secim){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1. sayıyı giriniz: ");
                s1=oku.nextInt();
                System.out.print("2. sayıyı giriniz: ");
                s2=oku.nextInt();
                break;
            case 5:
                System.out.println("Bir sayı giriniz");
                s1=oku.nextInt();
        }
        switch (secim){
            case 1:toplamYaz(s1,s2);break;
            case 2:cikarmaYaz(s1,s2);break;
            case 3:carpmaYaz(s1,s2);break;
            case 4:bolmeYaz(s1,s2);break;
            case 5:faktoriyelYaz(s1);break;
        }
    }
    public static void main(String[] args) {
        //kullanıcıya aşağıdaki gibi menü çıkartarak değişkenleri alınız
        // ve her bir elemanını değer alan fonksiyon olarak yazınız
          /*  1-toplam
            2-çıkarma
            3-toplama
            4-bolme
            5-Faktöryel ekle sonra
            6-Çıkış
        Bir işlem seçiniz */
        Scanner oku=new Scanner(System.in);
        int secim=0;
        do{
            menuYaz();
            secim=oku.nextInt();
            secimYap(secim);


        }while (secim<=6);


    }
}
