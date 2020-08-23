package Gun56.Ornek2;

import java.time.LocalDate;

public abstract class hayvan {
    public static int sayac=1;
    //sayac sadece hayvan sınıfına ait,static demek kalıtımı olmayan demek

    private String name;
    private boolean vahsi;
    private LocalDate dogumTarihi;
    private int id;



/*public hayvan(int id, String name, boolean vahsi, LocalDate dogumTarihi) {
        this.id = sayac;
        setName(name);
        setVahsi(vahsi);
        setDogumTarihi( dogumTarihi);
        sayac++;
    }*/

    abstract void yemekMiktari();
    abstract void yiyecegi();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }



    @Override
    public String toString() {
        return "hayvan\n" +
                "id=" + id +"\n"+
                "name='" + name + '\'' +"\n"+
                "vahsi=" + vahsi +"\n"+
                "dogumTarihi=" + dogumTarihi ;
    }
}
