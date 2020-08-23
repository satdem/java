package Mentoring.Mentorluk13Burak;

import java.util.Scanner;

public class Split9 {
    public static void main(String[] args) {
        //Todo bir scanner oluşturup bir tarih girin örn(19/08/2020)
        // bu tarihi / işaretlerine göre split uygulayın

        Scanner  sc=new Scanner(System.in);
        System.out.println("Doğum tarihini yazınız: ");

        String dogum=sc.nextLine();
        String[] array=dogum.split("/");
        for(String date:array){
            System.out.println(date);
        }
    }
}
