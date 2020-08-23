package Mentoring.Mentoring16Burak;

public class MetodOverloading2 {
    public static void main(String[] args) {
        //todo Overloading ------metoda aşırı yükleme-----Farklı tip parametrelerle
        dersNotu("Burak",78,80.14,true);
        dersNotu("Nazif",65,67.9,true);
        dersNotu("Ömer",100,100,true);
        dersNotu("Ali",95,true);
        dersNotu("Ege",50,45,false);
        dersNotu("Egemen",50,65);
    }
    public static void dersNotu(String isim,int not,double ortalama,boolean dersDurumu){
        System.out.println("Öğrencinin adı: "+isim+" - "+"Sınav notu: "+not+" - Ortalamsı: "+ortalama+" - Dersi geçti mi"+dersDurumu);
    }
    public static void dersNotu(String isim,int not,double ortalama){
        System.out.println("Öğrencinin adı: "+isim+" - "+"Sınav notu: "+not+" - Ortalamsı: "+ortalama);
    }
    public static void dersNotu(String isim,int not,boolean dersDurumu){
        System.out.println("Öğrencinin adı: "+isim+" - "+"Sınav notu: "+not+" - Dersi geçti mi"+dersDurumu);
    }


}
