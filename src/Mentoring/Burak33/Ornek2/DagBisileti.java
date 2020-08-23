package Mentoring.Burak33.Ornek2;

public class DagBisileti extends Bisiklet{
    int vitesSayisi;
    boolean araziTekeri;

    public DagBisileti(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int vitesSayisi, boolean araziTekeri) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.vitesSayisi = vitesSayisi;
        this.araziTekeri = araziTekeri;
    }
    void dagBisikletiInfo(){
        System.out.println("bisikletin vites sayisi = " + this.vitesSayisi);
        System.out.println("arazi tekeri  var mı= " + this.araziTekeri);
    }
}
