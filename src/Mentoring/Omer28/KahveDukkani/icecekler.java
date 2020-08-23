package Mentoring.Omer28.KahveDukkani;

public enum icecekler {
    TURKKAHVESI(3),
    ESPRESSO(4.5),
    GAZOZ(2.25),
    LIMONATA(2);

    private double fiyat;

    icecekler(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getfiyat(){
        return fiyat;
    }


}
