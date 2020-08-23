package Gun44.throwingException;

import java.util.Scanner;

public class _6_UncheckedThtowException {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        String UseName=oku.nextLine();

        if (UseName.length()<6){
            System.out.println("Kullanıcı adı 6 karakterden az olamaz");
        }

        if (UseName.length()>10){
            System.out.println("Kullanıcı adı 10 karakterden fazla olamaz");
        }

    }
}
