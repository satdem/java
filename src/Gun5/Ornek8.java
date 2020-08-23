package Gun5;

public class Ornek8 {
    public static void main(String[] args) {
        //Stringi sayıya dönüştürme:
        String ekrandanGelen1="500";
        String ekrandanGelen2="1000";
       // int  toplamBagis=ekrandanGelen1+ekrandanGelen2;  olmaz bunlar string çünkü

        int bagis1=Integer.parseInt(ekrandanGelen1);
        int bagis2=Integer.parseInt(ekrandanGelen2);
        int toplamBagis=bagis1+bagis2;
        System.out.println("toplamBagis = " + toplamBagis);


    }
}
