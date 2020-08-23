package Mentoring.Burak33.Ornek2;

public class elektrikliBisiklet extends Bisiklet {
    int akuKapasitesi;
    boolean gps;

    public elektrikliBisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int akuKapasitesi, boolean gps) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.akuKapasitesi = akuKapasitesi;
        this.gps = gps;
    }
    void elektrikliBisikletInfo(){
        System.out.println("bisikletin aku kapasitesi = " + this.akuKapasitesi);
        System.out.println("gps var mı = " + this.gps);
    }
}
