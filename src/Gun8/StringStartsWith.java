package Gun8;

public class StringStartsWith {
    public static void main(String[] args) {
        //StartsWith: bir sitringin verilen bir string ile başlayıp başlamdığını kontrol eder.büyük küçük harf ayrımı yapar.
        String text="Merhaba Dünya";
        System.out.println("ME ile başlıyor mu: " +text.startsWith("ME"));
        System.out.println("Me ile başlıyor mu: " +text.startsWith("Me"));
        System.out.println("M ile başlıyor mu: " +text.startsWith("M"));
        System.out.println("k ile başlıyor mu: " +text.startsWith("k"));
    }
}
