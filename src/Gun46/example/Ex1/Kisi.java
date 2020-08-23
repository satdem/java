package Gun46.example.Ex1;

public class Kisi {
    String ad;
    String soyad;
    private int yas;//private için daima set ve get kullanılır
  //setter
    public void setYas(int yas){//bilgi vermek için(ayarlama-atama)
        //veriye değer vermek istiyorum ama yanlış verebilirim bunun
        //için setter kullanıyorum
        if(yas>0)
        this.yas=yas;
        else
            this.yas=-yas;
        //this.yas=Math.abs(yas); şeklinde de yapabilirdim
    }
    //getter
    public int getYas(){//bilgi almak için(al-çağırma)
        //bu veriyi çağırmak için getter kullanıyorum
        return this.yas;
    }
}
