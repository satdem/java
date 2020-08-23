package Gun61;

import java.util.ArrayList;
import java.util.List;

public class soru11 {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("bule");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");//4 olsaydı hata olurdu
        System.out.println(colors);
       // ArrayList al=new ArrayList(); şeklinde de tanımlama mümkünmüş.normalde<string> falan yazıyorduk
      /*  ArrayList<Integer> i=new ArrayList<>();
        i.add(null);

        System.out.println(i);*///null herşeye eklenebiliyor.class olan herşeye boş değer atayabiliyoruz
    }
}
