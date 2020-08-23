package Mentoring.Mentorlük2;

import java.util.Scanner;

public class ornek1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Benim adım Tahir soyadım Ata yasım 37,boyum1.75,cinsiyetim erkek.
        String name,surname,gender;
        int age;
        double height;
        System.out.print("Adınızı giriniz: ");
        name=scan.nextLine();

        System.out.print("Soyadını giriniz:");
        surname=scan.nextLine();

        System.out.print("Yasınız: ");
        age=scan.nextInt();
           scan.nextLine();//farklı scanner kullanabilirim ya da her değişkenden sonra böyle bir satır ekleyebilirim.

        System.out.print("Boyunuzu yazınız:");
        height=scan.nextDouble();
          scan.nextLine();

        System.out.print("Cinsiyetiniz: ");
        gender=scan.nextLine();

        System.out.println("Benim adım "+name+" Soyadım "+surname+"." +"Yasım "+age+","+ " boyum "+ +height+" ve cinsiyetim "+gender);

    }
}

