package Gun55.Ornekler.Ornek2;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        //super(); //bu boş constructor yazmasak ta burada var
        //yazsak yada yazmasak farketmiyor extends old için,
        // ama superclassda karsılığı olmsalı
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }


    @Override
    double AlanHesabi() {
        return this.uzunluk*this.genislik ;
    }

    @Override
    double CevreHesabi() {
        return 2*(this.uzunluk+this.genislik);
    }
}
