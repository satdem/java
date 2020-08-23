package Mentoring.Mentorluk9bBurak;

import java.util.Scanner;

public class bWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pin kodunu giriniz:");
        int userPin=sc.nextInt();

        int pinCode=5555;
        while (userPin!=pinCode){
            System.out.println("******Yanlış PIN ********");
            System.out.println("Tekrar deneyin.");
            userPin=sc.nextInt();

        }
        System.out.println("Başarıyla giriş yaptınız.");
    }
}
