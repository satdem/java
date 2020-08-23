package Gun6;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("kullanıcı adı: ");
        String s=oku.nextLine();
        Scanner oku2=new Scanner(System.in);
        System.out.print("Password:");
        int p=oku2.nextInt();

        System.out.print("gizli soru= ");
        String Gizlicümle=oku.nextLine();// nexLine satır okur, nex sadece ilk kelimeyi okur.
        System.out.println("Kullanıcı adı: " +s);
        System.out.println("Password: " +p);
        System.out.println("Gizlicümle: " +Gizlicümle);

    }
}
