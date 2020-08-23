package Mentoring.Menroring23Zeynep;

public class Ogrenci {
    //isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
    // (degiskenlerini) iceren bir Ogrenci class i olusturunuz
    //ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.
    String isim;
    String bolum;
    int yas;
    int sinav1;
    int sinav2;
    int sinav3;
    double ortalamaBul(){
        return (sinav1+sinav2+sinav3)/3;
    }
}
