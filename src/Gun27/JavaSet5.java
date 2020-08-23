package Gun27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class JavaSet5 {
    public static void main(String[] args) {
        TreeSet<Integer> rakamlar=generatSet();//10 tane random rakamla dolsun
        System.out.println("rakamlar = " + rakamlar);

        addElements(rakamlar,10,100,100);
        System.out.println("rakamlar = " + rakamlar);

        addElements(rakamlar,50);
        System.out.println("rakamlar = " + rakamlar);
        System.out.println("rakamlar.size() = " + rakamlar.size());

        int[] ints=converToArra(rakamlar);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

    }
    //seti oluşturan metod
    public  static TreeSet<Integer> generatSet(){//HashSEt  kullansaydım sıralı olmazdı
        TreeSet<Integer> set=new TreeSet<>();
        while (set.size()<10){
            //for u kullanınca tekrar eden sayılar sıkıntı olurdu eleman sayısı 10 olmayabilirdi.
            // onun için while kullandık

            int randomSayi=(int)(Math.random()*100)+1;
            set.add(randomSayi);
        }
        return set;
    }
    // sete belli sayıda eleman ekleyen metod
    public  static void addElements(TreeSet<Integer> as, int...values){
        for (int i = 0; i <values.length ; i++) {
            as.add(values[i]);
        }
    }
    //Seti diziye çeviren metod
    public static int[] converToArra(TreeSet<Integer> set){
        //1.YOL
        int[] yeni=new int[set.size()];
        int i=0;
        for (int sayi:set){
            yeni[i++]=sayi;

        }return yeni;
    }
}
