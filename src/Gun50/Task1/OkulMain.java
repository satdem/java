package Gun50.Task1;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul("TechnoStudy", 100);
        Ogrenci ogr1 = new Ogrenci("Deniz", "Ümraniye", okul, UyeTipi.OGRENCI, 5000);
        Ogrenci ogr2 = new Ogrenci("Davut", "Üsküdar", okul, UyeTipi.OGRENCI, 6000);

        Calısan cal1=new Calısan("Hülya","Kartal",okul,UyeTipi.CALISAN,7000);
        Calısan cal2=new Calısan("Mustafa","Kadıköy",okul,UyeTipi.CALISAN,8000);

        okul.ogrenciKayit(ogr1);
        okul.ogrenciKayit(ogr2);

        okul.calisanKayit(cal1);
        okul.calisanKayit(cal2);

        System.out.println("okul = " + okul);

        okul.calisanListele();
        okul.ogrenciListele();


    }
}
