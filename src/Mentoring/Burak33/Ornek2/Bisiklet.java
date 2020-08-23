package Mentoring.Burak33.Ornek2;

public class Bisiklet {
    String renk;
    int kacTeker;
    double tekerlekBoyutu;
    boolean ziliVar;

    public Bisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar) {
        this.renk = renk;
        this.kacTeker = kacTeker;
        this.tekerlekBoyutu = tekerlekBoyutu;
        this.ziliVar = ziliVar;
    }
    void bisikletInfo(){
        System.out.println("Bisikletin rengi= "+this.renk);
        System.out.println("Bisikletin kac tekeri var = " + this.kacTeker);
        System.out.println("tekerlekBoyutu = " + this.tekerlekBoyutu);
        System.out.println("zili var mı= " + this.ziliVar);
    }

}
