package Gun46.example.Ex1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();

        kisi1.ad="Mustafa";
        kisi1.soyad="Gültekin";
        kisi1.setYas(-25);
        System.out.println("yas: "+kisi1.getYas());
    }

}
