package Gun12;

import java.util.Scanner;

public class JavaRandom10 {
    public static void main(String[] args) {
        //kullanıcıdan alt ve üst değeri tek bir satırda arasınada boşluk olarak random sayı üretin ve yazdırın

        Scanner oku=new Scanner(System.in);
        System.out.println(" min ve max değerini giriniz.");
        String min_max=oku.nextLine();
        int a=min_max.indexOf(" ");

        String min=min_max.substring(0,a);
        String max=min_max.substring(a+1);
        int mins=Integer.parseInt(min);
        int maxs=Integer.parseInt(max);

        int r=(int)(Math.random()*((maxs-mins)+1)+mins);
        System.out.println("rastgele = " + r);


    }
}
