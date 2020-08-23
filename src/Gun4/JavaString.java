package Gun4;

public class JavaString {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        String ad="Sati";
        String soyad="Demirci";
        System.out.println(ad);
        System.out.println("ad");
        System.out.println(ad+soyad);//çift tırnak arasında yazılmayan her şey değişkendir.Değişken Değeri yazılır.
        System.out.println("ad"+"soyad");
        String fullName=ad+soyad;
        System.out.println("fullName= "+fullName);
        int yas=40 ;
        System.out.println("Adım " +ad+" "+soyad +", yaşım "+yas+" tır.");
        String bilgi=ad+" "+soyad+" "+yas;
        System.out.println(bilgi);


    }
}
