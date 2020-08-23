package Gun47.Task1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        Scanner oku1=new Scanner(System.in);
        int ogrSayisi=1;

        Okul okul=new Okul("Atatürk ilköğretim okulu",3);
        ArrayList<Ogrenci> ogrenciler=okul.getOgrenciler();

        do{
            System.out.print(ogrSayisi+".Öğrencinin adı:");
            String ogrAd=oku.nextLine();
 
            System.out.print(ogrSayisi+".Öğrencinin soyadı:");
            String ogrsoyAd=oku.nextLine();

            System.out.print(ogrSayisi+".Öğrencinin yaşı:");
            int ogrYas=oku1.nextInt();

            try {


            Ogrenci ogr=new Ogrenci(ogrAd,ogrsoyAd,ogrYas);
            ogrenciler.add(ogr);
            ogrSayisi++;

            }catch (InputMismatchException ex){
                System.out.println("Lütfem sayı giriniz" );

            }catch (Exception ex){
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }

        }while (ogrSayisi<=okul.getMaxOgrenciSayisi());
        for (Ogrenci ogr:okul.getOgrenciler()) {
            System.out.println("ogr = " + ogr);
        }

    }
}

