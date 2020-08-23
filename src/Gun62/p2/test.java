package Gun62.p2;

import Gun62.p1.Acc;

public class test extends Acc {
    public static void main(String[] args) {
        Acc obj = new test();
        // obj.s // sadec public olana ulaşabildik protected a ulaşamadık çünkü referansı child class referansı değildi.

        // Alttaki gibi child class referans olduğunda protected a ulaşılabilid.
        test obj2 = new test();
        //obj2.r
        //obj2.s
    }
}
