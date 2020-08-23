package Gun55.Ornekler.Ornek2;

public class SekilMain {
    public static void main(String[] args) {
        Dikdortgen dd=new Dikdortgen(4,5);
        dd.setName("Yeni Dikdörtgen" );
        System.out.println("dd = " + dd);
        System.out.println("dd.toString2() = " + dd.toString2());
        
        Cember cm=new Cember(6);
        cm.setName("Yeni cember");
        System.out.println("cm = " + cm);
        System.out.println("cm.toString2() = " + cm.toString2());
        
        
    }
}
