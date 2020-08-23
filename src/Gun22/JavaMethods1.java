package Gun22;

public class JavaMethods1 {
    // metod veye fonksiyon
    public static void merhabaDunyayaz(){//class dan sonra yazmalıyız
        System.out.println("Merhaba Dünya 3");// main den sonrada (yine dışında olacak ama)tanımlayabilirdik.
        // içine yazılmaz
    }
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya 2");

        merhabaDunyayaz();// ***fonksiyon çağırma***
        merhabaDunyayaz();
        merhabaDunyayaz();
    }
}
