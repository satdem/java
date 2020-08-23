package Mentoring.Mentorluk8zeynep;

public class ornek1 {
    public static void main(String[] args) {
        //iki tane atılan zarın üste gelenlerin toplamının 9 olması durumunda "kazandınız" yqzdırın
        int max=6;
        int min=1;
        int zar1=(int)(Math.random()*(max-min)+1)+min;
        int zar2=(int)(Math.random()*(max-min)+1)+min;
        System.out.println(zar1);
        System.out.println(zar2);
        int top=zar1+zar2;
        if(top==9)
            System.out.println("kazandınız");
        else System.out.println("tekrar deneyiniz");
        /*ikinci yol ternary(üçleme) yöntemi
        String str = (toplam == 9)?"kazandiniz" : "Tekrar deneyiniz";

        System.out.println(str);

         */

    }
}
