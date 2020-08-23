package Gun46.example.Ex2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba bentley=new Araba();
        //setter : götür
        //getter : getir
        bentley.setRenk("Kırmızı");
        bentley.setModel("benteyga");
        bentley.setMotor(4500);
        bentley.setKapiSayisi(2);

        Araba porsche=new Araba("mavi","911Turbo",3600,2);

        Araba toyota=new Araba("beyaz","camry",1600,-5);
        System.out.println("porsche.getKapiSayisi() = " + porsche.getKapiSayisi());

        System.out.println("toyota.getKapiSayisi() = " + toyota.getKapiSayisi());
       //- değer verdiğim için default değeri alıp "0" yazıyor
    }
}
