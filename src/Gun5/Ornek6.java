package Gun5;

public class Ornek6 {
    public static void main(String[] args) {
         //Sayılar arası dönüşüm:
        int sayi=5;
        double rakam=55.67;
        rakam =sayi;//otomatik dönüşüm
        sayi =(int)rakam;//manuel dönüşüm
        //sayıyı stringe dönüştürma;
        String yazi=Integer.toString(sayi);
        String yazi2=Double.toString(rakam);
        System.out.println("yazi = " + yazi);
        System.out.println("yazi2 = " + yazi2);



    }
}
