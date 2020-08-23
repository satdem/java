package Gun47.Task1;

import java.util.ArrayList;

public class Okul {
   private String OkulAd;
   private int maxOgrenciSayisi;
   private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
        setOkulAd(OkulAd);
        setMaxOgrenciSayisi(maxOgrenciSayisi);

    }

    public String getOkulAd() {
        return OkulAd;
    }

    public void setOkulAd(String okulAd) {
        OkulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }


}
