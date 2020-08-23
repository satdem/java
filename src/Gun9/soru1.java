package Gun9;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı yazınız: ");
        String tamAd=oku.nextLine();
       
        int boslukIndex=tamAd.indexOf(" ");
        String ilkHarf=tamAd.substring(0,1).toLowerCase();//a
        String soyadIlkharf=tamAd.substring(boslukIndex+1,boslukIndex+2).toLowerCase();

        System.out.println("ilk harf= " +ilkHarf);
        System.out.println("soyad ilk harf= " +soyadIlkharf);
        
        String yeniTamAd=ilkHarf+tamAd.substring(1,boslukIndex+1)+soyadIlkharf+tamAd.substring(boslukIndex+2);
        System.out.println("yeniTamAd = " + yeniTamAd);

    }

}
