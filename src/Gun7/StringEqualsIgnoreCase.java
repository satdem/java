package Gun7;

public class StringEqualsIgnoreCase {

    public static void main(String[] args) {
        //2 stringin büyük küçük karakter ayrımı yapmadan karşılaştırır.
        //sonuç boolean dır
        String str="Merhaba";

        boolean Esitmi=str.equalsIgnoreCase("merHaba");

        System.out.println("Esitmi = " + Esitmi);

        System.out.println("Esitmi = " + str.equalsIgnoreCase("merHA"));
        System.out.println("Esitmi = " + str.equalsIgnoreCase("merHABA"));
    }
}
