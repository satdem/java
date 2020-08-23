package Gun8;

public class StringEndsWith {
    public static void main(String[] args) {
        // EndsWith: bir sitrinin sonu .... ile bitiyor mu onu kontrol eder.büyük küçük harf ayrımı yapar.
        String text="Merhaba Dünya";
        System.out.println("ya ile bitiyor mu: " +text.endsWith("ya"));
        System.out.println("A ile bitiyor mu: " +text.endsWith("A"));
        System.out.println("a ile bitiyor mu: " +text.endsWith("a"));
        System.out.println("ba ile bitiyor mu: " +text.endsWith("ba"));
    }
}
