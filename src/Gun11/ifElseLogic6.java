package Gun11;

import java.util.Scanner;

public class ifElseLogic6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //Girilen yeni bir passwordun kurallara uygunluğunu kontrol ediniz
        //kural1:en az 8 karakter
        //kural 2: içinde pass olmamalı
        //kural 3: en çok 12 karakter olmalı
        System.out.print("Passwordunuzu yazınız: ");
        String pass=oku.nextLine();
        if (pass.length()>=8 && pass.length()<=12 && !pass.contains("pass"))
            System.out.println("password geçerli");
        else System.out.println("password geçerli değil");
    }
}
