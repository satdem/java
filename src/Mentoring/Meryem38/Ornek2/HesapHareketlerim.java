package Mentoring.Meryem38.Ornek2;

public class HesapHareketlerim {
    public static void main(String[] args) {
        benimHesabim hesabim=new benimHesabim(500000);
        System.out.println("bakiyeniz="+hesabim.bakiye);

        System.out.println(hesabim.paraYatir(5000));
        System.out.println(hesabim.paraCekme(45000));

    }
}
