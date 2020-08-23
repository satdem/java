package Gun4;

public class NarrowingCasting {
    public static void main(String[] args){
    //double->float->long->int->char>short->byte; manuel dönüşüm. Büyüğü küçüğe dönüştürme.
        double vergi=6.756;
        int yuvarlanmısVergi=(int)vergi;//başına int yazmazsak hata veriyor.
        System.out.println("yuvarlanmısVergi = " + yuvarlanmısVergi);


    }
}
