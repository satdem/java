package Gun5;

public class Ornek11 {

    public static void main(String[] args) {

        //string olarak verilen gece ve gündüz hava sıcaklığı bilgisini toplamını yazdırınız.
        String gece="11";
        //System.out.println(gece+5);
        String gunduz="33";
        int gece2=Integer.parseInt(gece);
        System.out.println(gece2);
        int gunduz2=Integer.parseInt(gunduz);
        int toplam= gece2+gunduz2;
        System.out.println("toplam = " + toplam);
        // int olarak verilen tel noyu stringe dönüştür.

        int a=1755465454;
        String s=Integer.toString(a);

        System.out.println("tel no = " + s);



    }
}

