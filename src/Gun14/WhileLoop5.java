package Gun14;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //girilen bir sayıya kadar olan sayıların toplamını bulunuz ve yazdırınız.

               System.out.println("döngü için bir sayı giriniz: ");
                int a=oku.nextInt();
                int sayac=1;
                int toplam=0;

        while(a>0){
            toplam=toplam+a--;
        }
        System.out.println("toplam = " + toplam);
    }
}
