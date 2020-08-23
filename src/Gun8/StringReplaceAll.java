package Gun8;

public class StringReplaceAll {

    public static void main(String[] args) {
        //Replaceall: replace gibi çalışır,farklı kritere göre değiştirir.
        String text="Merhaba Dünya";
        System.out.println("orjinal text = " + text);
        System.out.println("a,b,n leri -yapılmış hali: " +text.replaceAll("[abn]","-"));
        //[] kullanmak zorundayım.
        System.out.println("Büyük harfleri - yapılmış hali: "+text.replaceAll("[A-Z]","-"));
        System.out.println("Büyük harfleri - yapılmış hali: "+text.replaceAll("[A-Z]",".."));
        System.out.println("bütün harflerin x  yapılmış hali: "+text.replaceAll("[A-Z]","x").replaceAll("[a-z]","x"));
    }
}
