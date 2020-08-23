package Gun14;

import java.util.Scanner;

public class WhileLoop7 {
    public static void main(String[] args) {
        //kullanıcıdan 5 sayı isteyiniz bu sayılardan en büyüğünü yazdırın
        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int max = 0;
        while (sayac <= 5) {
            System.out.print(sayac+". sayıyı giriniz:");
            int a = oku.nextInt();
            sayac++;
            max=Math.max(a,max);
        }
        System.out.println("En büyük sayı:"+max);


        }
    }

