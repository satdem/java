package Gun24;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //Array: boyut sayısının belli olduğu ve
        // elemanların çok sık değiştirilmediği durumlarda kullandık

        //ArrayList:Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı
        ArrayList<Integer> integerliste=new ArrayList<Integer>();//tanımlam
        ArrayList<Boolean> booleanliste=new ArrayList<Boolean>();
        ArrayList<String> stringliste=new ArrayList<>();

       // String arraylist tanımlama
        ArrayList<String> isimler=new ArrayList<>();

        //eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("1-isimler = " + isimler);

        //belli bir indexe eleman ekleme ,eklendikten sonrakiler bir aşağı kayar
        isimler.add(1,"Zeynep");
        System.out.println("2-isimler = " + isimler);

        //2 nolu index teki elemanı verir     *****.    .get(a) a indexli elemanı verir
        String isimAtIndex2=isimler.get(2);

        //0. indexteki elemanı değiştirir     *****    .set("x")  ile değiştirecek
        isimler.set(0,"Deniz");
        System.out.println("3-isimler = " + isimler);

        // Eleman sayısını verir , Array deki length   ******  .size boyutu verir
        int elemanSayisi=isimler.size();
        System.out.println("elemanSayisi = " + elemanSayisi);

        // Listenin tamamen boş olup olmadığınız verir.****    .isEmpty

        boolean listeBosMu=isimler.isEmpty();
        System.out.println("listeBosMu = " + listeBosMu);

        //Eleman silme ******    .remove
        isimler.remove("Ayşe");
        System.out.println("4-isimler = " + isimler);
        //aynı isimden iki tane varsa ilkini siler
        isimler.remove(1);
        System.out.println("5-isimler = " + isimler);

        //Bir elemanın indexini bulma  ****      .indexOf()
        int kayaindex=isimler.indexOf("Kaya");
        System.out.println("Kaya nın indexi:"+kayaindex);

        //Tüm elemanları boşaltma ****         .clear
        isimler.clear();
        System.out.println("6-isimler = " + isimler);

    }
}
