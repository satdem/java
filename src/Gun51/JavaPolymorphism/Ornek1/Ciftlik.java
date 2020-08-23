package Gun51.JavaPolymorphism.Ornek1;

public class Ciftlik {
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }
    //Polymorphism imkanı ile 2 farklı subclas dan üretilmiş nesne
    //    // super class gibi biçimimnde (Çok biçimlilik) aynı metoda tek bir tipmiş
    //    // gibi gönderilebildi buna Polymorphism (Çok biçimlilik) denir.
    //    // üstteki metdolarla aynı yerde olması için, burada yazıldı, en doğruu
    //    // Hayvan class ında olması bu metodun.
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("karabas");
        Kedi kedi1=new Kedi("kopuk");

        kopek1.ses();
        kedi1.ses();
        kopek1.kokladi();
        //referans tipi ile nesne tipi aynı olduğundan
        //bütün metod ve fieldlar kullanılabilir

        Hayvan kopek2=new Kopek("comar");
        Hayvan kedi2=new Kedi("pamuk");

        kopek2.ses();
        kedi2.ses();
       // kopek2.kokladi();
        //sadece subclasslarda olan metodlar  ve fieldlar
        // bu tanımlamada kullanılamıyor

        System.out.println("---------------------------------");
        kopekSesi(kopek1);
        kediSesi(kedi1);

        System.out.println("-------------hayvan sesleri--------------------");
        hayvanSesi(kopek1);
        hayvanSesi(kedi1);
        //    Kopek kopek1                 =    new Kopek("karabaş");
//    referans tipi Kopek               nesnenin tipi (instance) Kopek
//
//    Hayvan kopek2                =    new Kopek("çomar");
//    referans tipi Hayvan              nesnenin tipi Kopek

        /*Çok Biçimlilik — Polymorphism
Java’da farklı şekilde çalışan nesnelere aynı şekilde
 erişmek şeklinde tanımlayabiliriz.
 Diğer bir tanım olarak bir nesnenin farklı bir nesne
 gibi davranmasıdır…*/

    }
}
