package Gun44.throwingException;

import java.util.Scanner;

public class _7_UncheckedThtowException {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        String UseName=oku.nextLine();

        try{
            if (UseName.length()<6)
                throw new Exception("Kullanıcı adı 6 karakterden az olamaz");
            //throw ile kendi hatamızı oluşturmuş oluyoruz
            //böylece kriterimize girmeyenler için de
            //catch bloğuna düşürerek pratiklik sağlıyoruz

            if (UseName.length()>10)
                throw  new Exception("Kullanıcı adı 10 karakterden fazla olamaz");
        }
        catch (Exception ex){
            System.out.println("ex = " + ex);
        }
    }
}
