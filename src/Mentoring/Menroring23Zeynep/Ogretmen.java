package Mentoring.Menroring23Zeynep;

public class Ogretmen {
    //isim, bolum ve deneyim instance variable (degiskenlerini) iceren bir Ogretmen class i olusturunuz.
    //ogretmenimNasil adli bir method icinde deneyim yilina gore ogretmenin kalitesini olcun.
    String isim;
    String bolum;
    int yil;

    String ogretmenimNasil(){
        String nasil="";
        if(yil<4)
            nasil="Öğretmenim çok gayretli";
        else if(yil>=4 && yil<10)
            nasil="Öğretmenim çok bilgili";
        else
            nasil="Öğretmenim çok tecrübeli";

        return nasil;
    }

}
