package Mentoring.Burak33.Ornek1;

public class Calisan {
    private String isim;
    private String alan;
    private int maas;

    public Calisan(String isim, String alan, int maas) {
        this.isim = isim;
        this.alan = alan;
        this.maas = maas;
    }
    public void bilgiler(){
        System.out.println("Calışan bilgileri yazdırılıyor...");

        System.out.println("isim = " + this.isim);
        System.out.println("iş alanı = " + this.alan);
        System.out.println("maas = " + this.maas);
    }
}

