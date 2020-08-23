package Gun39.JavaEnum.Ex3;

import java.util.ArrayList;

public class Ex3Main {
    //1-bir kitap sınıfı yazınız, fields:name ve katagori(enum)
    //2-KitapKatagori adında bir enum oluşturunuz: klasik roman fantezi tarih EKONOMİ
    //3-3 kitap tanımla Arrayliste ata
    //4-roman katagorisini yazdır
    public static void main(String[] args) {
        Kitap kit1=new Kitap();
        kit1.name="Sefiller";
        kit1.katagori=KitapKatagori.ROMAN;

        Kitap kit2=new Kitap();
        kit2.name="Beyaz Zambak";
        kit2.katagori=KitapKatagori.ROMAN;

        Kitap kit3=new Kitap();
        kit3.name="Falaka";
        kit3.katagori=KitapKatagori.KLASIK;

        ArrayList<Kitap> kitaplar=new ArrayList<>();
        kitaplar.add(kit1);
        kitaplar.add(kit2);
        kitaplar.add(kit3);

        for (Kitap k:kitaplar) {
            if(k.katagori.equals(KitapKatagori.ROMAN))
                System.out.println(k.name);
        }

    }
}
