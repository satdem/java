package Mentoring.Omer37._abstract.sirket;

import java.util.Scanner;

public abstract class insan {
    private String isim;
    private String soyisim;

    public insan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }
    public abstract void calis();

    public void Bilgilendirme() {
        System.out.println("isim: "+this.isim+" Soyisim: "+this.soyisim);
    }
    public  void yeniAdlar(String isim,String soyisim){
        Scanner oku=new Scanner(System.in);
        System.out.println("isim ve soyisim degisrtir");
        String yeniIsim=oku.nextLine();
        System.out.println(yeniIsim);
    }

}
