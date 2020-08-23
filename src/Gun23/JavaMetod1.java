package Gun23;

public class JavaMetod1 {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya 1");
        System.out.println("Merhaba Dünya 2");

        merhabaYaz();

        int enb = Math.max(3,4); // 2 sayıdan en büyüğünü bulup

        int enbTurkce= enBuyukBul(3,4);

        String adsoyad= AdSoyadBirlestir("Ali", "Demir");
        System.out.println("adsoyad = " + adsoyad);
        // burda birleşmiş haline ulaşabiliyormuyum şu anda, return yaptığımda geri alabildim
    }

    public static String AdSoyadBirlestir(String ad, String soyad)
            //yukarıda void i kullansaydım aşağıda sout tu kullnmalıyım ama bunu bir daha
            //birleşmiş şekilde programda kullanamıyorum.return bieleştirip programa gönderiyor
           // onu artık hep programda kullnabiliyorum ama bir stringe eşitlemem lazım
            //String adsoyad= AdSoyadBirlestir("Ali", "Demir"); gibi
    {
        return ad+" "+soyad;
        //System.out.println(ad+" "+soyad);
    }

    public static int enBuyukBul(int a, int b)
    {
        if (a>b)
            return a; // returnun görevi bu fonksiyonu çağıran yere değeri göndermek
        else
            return b;

        // return Math.max(a,b);
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
    }

}
