package Gun7;

public class StringIndexOf {
    public static void main(String[] args) {
        //Verilen karakter(ler)in sıra numarasını gösteriyor.0'dan başlıyarak indexini veriyor
        //contains ten farklı olarak sırasını veriyor.contains var mı yok mu onu söylüyordu.

        String text="Good";
        System.out.println("G harfinin indexi = " +text.indexOf("G"));
        System.out.println("d harfinin indexi = " +text.indexOf("d"));
        System.out.println("H harfinin indexi = " +text.indexOf("H"));//-1 bulunamadı demek
        System.out.println("od harfinin indexi = " +text.indexOf("od"));//var ise ilk bulunan harfin sırasını verir.

        int index =text.indexOf("o");//integer değişkenine atanır.
        System.out.println("index o :"+index);




    }
}
