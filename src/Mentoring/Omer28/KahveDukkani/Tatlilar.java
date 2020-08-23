package Mentoring.Omer28.KahveDukkani;

public enum Tatlilar {
    CILEKLIPASTA (4),              MOZAİKPASTA (3.5),               MUZLUPASTA (4.5);
private double fiyat;
    Tatlilar(double fiyat) {
        this.fiyat=fiyat;
    }
    public double getFiyat(){
        return fiyat;
    }
}
