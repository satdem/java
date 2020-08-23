package Mentoring.Burak33.Ornek2;

public class BisikletMain {
    public static void main(String[] args) {
        Bisiklet B=new Bisiklet("Beyaz",2,26,true);
        B.bisikletInfo();
        System.out.println("--------------------------------------------");

        DagBisileti db=new DagBisileti("Kırmızı",2,28,false,24,true);
        db.bisikletInfo();
        db.dagBisikletiInfo();
        System.out.println("--------------------------------------------");


        elektrikliBisiklet eb=new elektrikliBisiklet("Siyah",3,26,true,750,true);
        eb.bisikletInfo();
        eb.elektrikliBisikletInfo();
    }
}
