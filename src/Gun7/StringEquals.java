package Gun7;

public class StringEquals {
    public static void main(String[] args) {
        //iki stringin eşit olup olmadığını kontrol eder,
        // sonuç boolaen değişkenidir.
        String str="Merhaba";

        boolean birebirEsitmi=str.equals("Merhaba");

        System.out.println("birebirEsitmi = " + birebirEsitmi);

        System.out.println("birebirEsitmi = " + str.equals("merhaba"));

    }
}
