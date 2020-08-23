package Gun8;

public class StringReplace {
    public static void main(String[] args) {
        //Replace: Bir stringin içerisindeki istenen karakter(leri)n hepsini yenisi ile değiştirir.

      String text="Merhaba Dünya";
        System.out.println("orjinal hali: "+text);
        System.out.println("a ları e yap hali: "+text.replace('a','e'));
        System.out.println("ba ları de yap hali: "+text.replace("ba","de"));
        System.out.println("Dünya yı Java yap: "+text.replace("Dünya","Java"));



    }
}
