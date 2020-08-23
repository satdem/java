package Gun8;

public class StringTrim {
    public static void main(String[] args) {

        //Trim: Stringin başında ve sonunda olan boşluk olan karakterleri temizler.
        String text="   Merhaba Dünya   ";
        System.out.println("orjinal text=-> "+text+"<-");
        System.out.println("boşluktan temizlenmiş halı:->"+text.trim()+"<-");

    }
}
