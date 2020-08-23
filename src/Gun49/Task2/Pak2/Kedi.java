package Gun49.Task2.Pak2;

import Gun49.Task2.Pak1.pak1Hayvan;

public class Kedi extends pak1Hayvan {
    public Kedi(String ad,String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;

    }

    public void BilgiYaz(){
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);
    }
}
