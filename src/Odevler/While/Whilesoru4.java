package Odevler.While;

public class Whilesoru4 {
    public static void main(String[] args) {
       //4- 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız
        int a=1;
        while (a<=255){
            int i=a;
            char c=(char)a;
            System.out.print(c+"=");
            System.out.print(i+", ");
            a++;

        }

    }
}
