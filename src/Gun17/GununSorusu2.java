package Gun17;

import java.util.Scanner;

public class GununSorusu2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("1.Ücreti giriniz");
        String ucr1=oku.nextLine();

        System.out.println("2.Ücreti giriniz");
        String ucr2=oku.nextLine();

        System.out.println("3.Ücreti giriniz");
        String ucr3=oku.nextLine();

        int rakamUcr1=Integer.parseInt(ucr1.replaceAll("[$A-Za-z]",""));
        int rakamUcr2=Integer.parseInt(ucr2.replaceAll("[$A-Za-z]",""));
        int rakamUcr3=Integer.parseInt(ucr3.replaceAll("[$A-Za-z]",""));

        int toplam=rakamUcr1+rakamUcr2+rakamUcr3;
        if(toplam>0) System.out.println("toplam = " + toplam);
        if (toplam<0) System.out.println("-1");




    }
}
