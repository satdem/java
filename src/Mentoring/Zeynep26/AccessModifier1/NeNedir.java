package Mentoring.Zeynep26.AccessModifier1;

public class NeNedir {
    /*
    * Access Modifier ler ne demektir?(erişim belirleyici)
    * Aralarındaki farklar nelerdir
    **/
    public int yas;
    protected double  numara;
    private int yil=1994;
    //encapsulation
    public void yiliYazdir(){//yılı capsulleyip yazdırabiliyorum dolaylı olarak
        System.out.println(yil);//yili değiştiremiyorum sadece ulaşmayı sağlıyor

    }
    String isim;

    /*  ornek1

     adi eyaletVergisi olan bir method olusturun
     ve bu method sadece ayni package icinde erisilebilir olsun
     return tipi double ve parametresi bir String
     tum $ ve , isaretlerini kaldirip, degeri double olarak degistiriniz
     (vergi orani ise double degerin 7.75 idir)
     */

    double eyaletVergisi(String a){
        //a=a.replaceAll("$","");
        //a.replace(",","");
        a = a.replaceAll("\\$","").replaceAll("\\,","");
        double d=Double.parseDouble(a);
        double v = d * 0.00775;
        return v;
    }

}
