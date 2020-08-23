package Gun6;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Kullanıcıdan adını ve soyadını ayrı ayrı okutarark alıp birlikte yazdırın.
        System.out.print("Adınızı yazınız:");
        String ad=oku.nextLine();
        System.out.print("Soyadınızı yazınız: ");
        String soyad=oku.nextLine();
        System.out.println("Adınız ve Soyadınız : " +ad+" "+soyad);
        System.out.println("merhaba " +ad+" "+soyad);




    }

}
