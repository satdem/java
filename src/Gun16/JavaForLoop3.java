package Gun16;

import java.util.Scanner;

public class JavaForLoop3 {
    public static void main(String[] args) {
        //kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulun.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a=oku.nextInt();
        int toplam=0;
        
        for(int i=1;i<=a;i++){
            toplam=toplam +i;
        }
        System.out.println("toplam = " + toplam);
    }
}
