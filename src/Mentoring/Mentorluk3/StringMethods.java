package Mentoring.Mentorluk3;

public class StringMethods {

    public static void main(String[] args) {
        /** IndexOf()
        * bir karakterin kaçıncı sırada olduğunu verir
         * char methodunun tersi
         */
        String cicek="Gunebakan";
        System.out.println("e harfi metinde kaçıncı sırada: "+ cicek.indexOf("e"));

        /**lastIndexOf()
         *
         */

        System.out.println("sondaki n kaçıncı sırada: " +cicek.lastIndexOf('n'));
        /** charAt():
         *
         */
        String sehir="İstanbul";
        System.out.println("metinde 5. sıradaki(index) harf: "+sehir.charAt(5));

        /** Substring():
         *
         */
        String adim="Yurdakul";
        System.out.println("2. indexten itibaren yazar."+adim.substring(2));
        System.out.println("3.ile 5 arasını yazar."+adim.substring(3,5));

        String bilgi="işim:IT öğrenmek!";
        int bosluk=bilgi.indexOf(" ");
        System.out.println(bilgi.substring(bosluk+1));


        /** trim() :boşluklarısiler baştaki ve sondaki
         *
         */
        String ulke="           ALMANYA             ";
        System.out.println("ulke = " + ulke);
        System.out.println("son hali ulke = " + ulke.trim());

        /** replace():
         *
         */
         String ozellik="Hayal etmek";
        System.out.println("a harfini & ile değiştir: " +ozellik.replace("a","&"));
        String kuruyemis="yer fıstığı";
        System.out.println("bir dizi kümesini değiştirme: "+kuruyemis.replace("yer","gaziantep"));

        /** replaceAll():
         *
         */

        String numara="&1800 Milyon";
        System.out.println("Replace methodu: "+ numara.replaceAll("[a-zA-Z]",""));
        System.out.println("Replace methodu: "+ numara.replaceAll("[0-9]",""));
//                                                           bu araya virgül koyabilirizz A arasına

        /** contains(): metin de arama yapıyor
         *  equals() : metinin birebir eşitliğini kontrol ediyor
         *  equalsIgnoreCase():metnin büyük küçük harf ayırmaksızın eşitliğini kontrol eder
         */

        String ad="Bahadır";
        System.out.println("aynı mı: " +ad.equals("bahadır"));
        System.out.println("aynı mı: " +ad.equals("Bahadır"));
        System.out.println("aynı mı: " +ad.equalsIgnoreCase("bahadır"));
        String sahipMi="Baha";
        System.out.println("ad değişkeninde baha var mı: "+ad.contains(sahipMi));

        /** stratswith (): metnin başlangıcı istenen dizi ile mi başlıyor
         * endswith():metnin sonu istenen dizi ile mi bitiyor
         */

        System.out.println("metin ba ile mi başlıyor: " +ad.startsWith("ba"));
        System.out.println("metin bdır ile mi bitıyor: " +ad.startsWith("dır"));







    }
}
