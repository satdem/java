package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList3 {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        //Arayları sıralarken Arrays.sort u kullandığımız gibi,
        //ArrayListe de collection metodlarını kullanacağız

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Sıralı değil = " + numbers);
        //Sıralama
        Collections.sort(numbers);
        System.out.println("Sıralı = " + numbers);

        //en büyük değeri bulur
        int max=Collections.max(numbers);
        //en küçük elemanı bulur
        int min=Collections.min(numbers);
        Collections.reverse(numbers);
        System.out.println(" ters numbers = " + numbers);

        //bir değere göre doldurma
        Collections.fill(numbers,101);
        System.out.println("fill den sonra numbers = " + numbers);

        //belli bir elemanı yada elemanalrı yenisi ile değiştirme
        Collections.replaceAll(numbers,69,5);
        System.out.println("replaceAll dan sonra numbers = " + numbers);



    }
}
