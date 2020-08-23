package MethodCalismalari;

import java.util.Scanner;
import java.util.TreeSet;

public class Metod1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.print("Max değerini giriniz: ");
        int max=sc.nextInt();
        System.out.print("Min değerini giriniz: ");
        int min=sc.nextInt();
        System.out.println(numaraVer(max,min));*/
        System.out.println("***************************");

    String str=" meRhaBA ";
    String str2="  hasaN aLi     demir   ";
    System.out.println(kelimeDuzenle(str));
        System.out.println(isimDuzenle(str2));
        String str3="     türK    diLi   ";
        System.out.println("isimDuzenleDers(str3) = " + isimDuzenleDers(str3));

        String ders=kullanicidanVeriAl("bir ders yazınız");
        TreeSet<String> dersler=new TreeSet<>();
        dersEkle(dersler,ders);
        String s="123a";
        System.out.println("girdiSayiMi(s) = " + girdiSayiMi(s));

}
   /* Method-1 public static String kelimeDuzenle(String str)
    Açıklaması: gelen str degiskenini trim edip ilk harfini büyük diger harflerini kücük yapacak ve return edecek.
            Örnek: str: " meRhaBA   "  -->  return : "Merhaba"*/
    public static String kelimeDuzenle(String str){
     String a=str.trim();
     a=a.toLowerCase();
     a=a.replace(a.substring(0,1),a.substring(0,1).toUpperCase());
        return a;
    }


    /*Method-2 public static String isimDuzenle(String str)
Açıklaması: gelen stryi .trim() edecek, .replaceAll("[ ]+", " "); ile kelimeler arasinda birden fazla bosluk varsa
fazla boşlukları bir bosluga dönüstürecek, .split(" "); ile String[] arraye atacak, cümlenin son kelimesinin tüm harfleri büyük
öncekileri kelimeDuzenle() methodu'nu kullanarak düzenleyip, önde ve sonda bosluk olmadan return edecek.
Örnek: str : "  hasaN aLi     demir   "  -->  return : "Hasan Ali DEMIR"*/
    public static String isimDuzenle(String str){
        String a="";
        String[] arr=str.trim().replaceAll("[ ]+", " ").split(" ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=kelimeDuzenle(arr[i]);
            a+=arr[i]+" ";
        }
        return a.trim();
    }
    /*Method-3 public static String isimDuzenleDers(String str)
Açıklaması: Method -2 ile benzer sadece tüm kelimeler kelimeDuzenle() methodu'nu kullanarak düzenlenecek.
Örnek: str : "     türK    diLi   "  -->  return : "Türk Dili"*/
    public static String isimDuzenleDers(String str){

       String a= str.trim().replaceAll("[ ]+", " ");
       String[] adizi=a.split(" ");
       String x="";
        for (int i = 0; i < adizi.length; i++) {
            x+=isimDuzenle(adizi[i])+" ";
        }

       return x.trim();
    }
   /* Method-4 public static int numaraVer(int min, int max)
    Açıklaması: aldigi min ve max değerleri arasında random sayi üretip return edecek
    Örnek: numaraVer(10, 100);  -->  67*/
   public static int numaraVer(int min, int max){
       int random=(int)((Math.random()*(max-min)+1)+min);
       return random;

   }
   /*Method-5 public static String kullanicidanVeriAl(String ekranYazisi)
Açıklaması: Scanner kullanarak kullanicidan bir kelime ya da cümle alacak.
Örnek: nextLine(); kullanınız*/
   public static String kullanicidanVeriAl(String cumle){
       Scanner sc=new Scanner(System.in);
       System.out.println(cumle);
       String str=sc.nextLine();
       return str;
   }
   /*Method-6 public static void dersEkle(TreeSet<String> dersler, String eklenecekDers)
Açıklaması: gelen eklenecekDers degiskenini kullanarak main de oluşturulacak TreeSet'e ekleyen method*/
    public static void dersEkle(TreeSet<String> dersler, String eklenecekDers){
        dersler.add(eklenecekDers);
    }
    /*Method-7 public static void listeDersler(TreeSet<String> dersler)
Açıklaması: gelen TreeSet'deki tüm verileri ekrana yazdıran method*/
    public static void listeDersler(TreeSet<String> dersler){
        System.out.println(dersler);
    }
    /*
Method-8 public static void dersEkleForm(TreeSet<String> dersler)
Açıklaması: bu method icinde dersEkle cagrilacak ve kullanicidan kullanicidanVeriAl() methodu ile
ders adi alinacak isimDuzenleDers() ile düzenlenen isim dersEkle() methodu ile TreeSet e eklenecek */
    public static void dersEkleForm(TreeSet<String> dersler){
       String ders= kullanicidanVeriAl("Dersin adını giriniz:");
        ders=isimDuzenleDers(ders);
        dersEkle(dersler,ders);
    }
    /*
Method-9 public static boolean dersSil(TreeSet<String> dersler, String silinecekDers)
Açıklaması: silinecekDers adindaki dersi gelen TreeSetden silen method
Örnek: */
     public static boolean dersSil(TreeSet<String> dersler, String silinecekDers){

        boolean b=dersler.remove(silinecekDers);

         return b;
     }
/*
Method-10 public static boolean dersGuncelle(TreeSet<String> dersler, String eskiDersAdi, String yeniDersAdi)
Açıklaması: TreeSet içerisinde bulacağı eskiDersAdi adli dersi yeniDersAdi adına çeviren method
*/
     public static boolean dersGuncelle(TreeSet<String> dersler, String eskiDersAdi, String yeniDersAdi){
         boolean b=dersler.remove(eskiDersAdi);
         b=dersler.add(yeniDersAdi);
         return b;
     }

/*Method-11 public static boolean girdiSayiMi(String str)
Açıklaması: aldigi stringin sayi olup olmadigini döndüren method yaziniz
Örnek: "123a"  -->  false,     "1002"  --> True*/
     public static boolean girdiSayiMi(String str){
         str=str.replaceAll("[^0-9]","");
         boolean b=str.isEmpty();
         return b;
     }

}
