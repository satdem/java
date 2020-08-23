package Mentoring.Meryem34.Ulkeler;

import Mentoring.Meryem34.Ulkeler.Almanya;
import Mentoring.Meryem34.Ulkeler.Ingiltere;
import Mentoring.Meryem34.Ulkeler.ulkeler;

public class UlkelerMain {
    public static void main(String[] args) {
        ulkeler ulkeler=new ulkeler();
        ulkeler.isimleri();

        ulkeler almanya=new Almanya();
        almanya.isimleri();//burada oğrenci sayısını çağıramıyorum

        ulkeler ingiltere=new Ingiltere();
        ingiltere.isimleri();

        Almanya almanya1=new Almanya();
        almanya1.isimleri();
        almanya1.ogrenciSayisi();

    }
}
