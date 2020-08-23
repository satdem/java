package Gun39.example;

import java.util.ArrayList;

public class Ex1 {
     static final String name="Maximilian";

     static final ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Raplace= "+name.replace("i","o"));//burada name i değiştirmiyoruz
        // değiştirilmiş başka bir değişken oluyor

       // name=name.replace("i","o"); //final olduğu için name i değiştirmeme izin vermiyor

        list.add("Ahmet");
        list.add("Alperen");
        System.out.println("önce ki list: "+list.toString());
        //eleman ekleyebiliyoruz.çünkü Arrayliste yeni şeyler ekleyebiliyoruz

        //list=new ArrayList<>();//bura da arraylisti sıfırlamış olduk yeniden tanımlayınca(clear(); gibi)
        //final olduğu için sadece yeniden oluşturamıyoruz
        //System.out.println("sonra ki list: "+list.toString());

    }
    //main içinde kullanacağınız herşey (metodun dışından kullanacağımız )static veya new ile tanımlanmış olmalı.
    //sebebi:static bir canlı yapı olduğundaan içinde kullanılanlarda o anda erişilebilir canlı ,
    // yani static olmalı
}
