package Gun7;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        //Kullanıcıdan alacağımız bir kelimenin son harfini yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle yazınız:");
        String a=oku.nextLine();


        int l=a.length();
        char harf=a.charAt(l-1); //l tane karakter var ama 0'dan başladığı için (l-1) yazıyorum sonuncuyu bulmak için.
        System.out.println(" sonharf = " + harf);


    }
}
