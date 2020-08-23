package Gun50.Task1;

import java.util.ArrayList;

public class Okul {
    private  String isim;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrencileri;
    private ArrayList<Calısan> calisanlari;

    public Okul(String isim, int maxOgrenciSayisi) {
        setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        ogrencileri=new ArrayList<>();
        calisanlari=new ArrayList<>();//yukarıda
        // constructor dişinda da tanımlayabilirdim
        //farkı yok
    }
    public void ogrenciKayit(Ogrenci a){
        ogrencileri.add(a);
    }
    public void calisanKayit(Calısan a){
        calisanlari.add(a);

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    public ArrayList<Calısan> getCalisanlari() {
        return calisanlari;
    }

    public void setCalisanlari(ArrayList<Calısan> calisanlari) {
        this.calisanlari = calisanlari;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrencileri=" + ogrencileri +
                ", calisanlari=" + calisanlari +
                '}';
    }
    public void ogrenciListele(){
        for (Ogrenci ogr:ogrencileri) {
            System.out.println("ogrenci : " + ogr);
        }
    }//toStringdeki öğrencileri
    // ayriyetten böyle de yazdırabiliriz
    public void calisanListele(){
        for (Calısan cal:calisanlari) {
            System.out.println("calışan : " + cal);
        }//calışanlar için ikinci bir yazım şekli de bu
    }
}
