package Gun7;

public class StringCharAt {
    public static void main(String[] args) {
        //istenen noktadaki harfi verir.

                      //0123456789012
        String kelime ="Merhaba Dünya";
        char harf=kelime.charAt(3);
        System.out.println("3.harf = " + harf);//3. h çıktı çünkü saymaya 0'dan başlıyor.(Buna index denir)

        harf=kelime.charAt(0);
        System.out.println("0.harf = " + harf);
    }
}
