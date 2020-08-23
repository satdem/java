package Gun8;

public class StringReplaceFirst {
    public static void main(String[] args) {
        //ReplaceFirst: Replace ile aynısadece ilk bulunanı değiştirir.
        String text="Merhaba Dünya";
        System.out.println("orjinal text = " + text);
        System.out.println("ilk a yı e yap = " + text.replaceFirst("a","e"));//sadece çift tırnak kullanmalıyım.
        System.out.println("bütün a ları e yap = " + text.replace('a','e'));//çift tırnakta kullanabilirim



    }
}
