package Mentoring.Meryem38.Ornek1;

public class KacileCarp extends Urun {
    public KacileCarp(int kac) {
        super(kac);
    }

    public static void main(String[] args) {
        ikiileCarp iic=new ikiileCarp();
        KacileCarp kic=new KacileCarp(5);

        System.out.println(iic.carp(6));
        System.out.println(kic.carp(7));
    }
}
