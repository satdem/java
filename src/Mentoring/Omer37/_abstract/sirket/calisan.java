package Mentoring.Omer37._abstract.sirket;

public class calisan extends insan {
    private int calisanId;
    public calisan(String isim, String soyisim,int calisanId) {
        super(isim, soyisim);
        this.calisanId=calisanId;
    }

    @Override
    public void calis() {
        if(this.calisanId==0){
            System.out.println("calışan değil");
        }
        else
            System.out.println("Şirket çalışanı");

    }

    public static void main(String[] args) {
        insan ogr=new calisan("Ömer","Özdemir",0);
        insan sekreter=new calisan("Hande","Yılmaz",123);
        insan danisman=new calisan("Hüseyin","Yıldırım",12);
        ogr.Bilgilendirme();
        ogr.calis();
        sekreter.Bilgilendirme();
        sekreter.calis();
        danisman.Bilgilendirme();
        danisman.calis();

        danisman.yeniAdlar("ahmet","kaya");
    }
}
