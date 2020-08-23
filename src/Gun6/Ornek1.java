package Gun6;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        //Adınızı ve soyadınızı kullanıcıdan alarak ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve soyadınızı yazınız: ");
        String adSoyad=oku.nextLine();

        System.out.println("adSoyad = " + adSoyad);

    }
}
