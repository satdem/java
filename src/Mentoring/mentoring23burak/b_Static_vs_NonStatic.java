package Mentoring.mentoring23burak;

public class b_Static_vs_NonStatic {
    //todo static ve static olmayan metod
    // void hiçlik demek void yazdığım zaman metodun geri dönmesine ihtiyacım yok

    public static void buMetodStatic(){
        System.out.println("merhaba");
    }
    public void buMetodStaticDegil(){
        System.out.println("Selam");
    }

    public static void main(String[] args) {
        buMetodStatic();
        b_Static_vs_NonStatic yeniobje=new b_Static_vs_NonStatic();
        yeniobje.buMetodStaticDegil();
    }
}
