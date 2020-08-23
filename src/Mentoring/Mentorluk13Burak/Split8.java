package Mentoring.Mentorluk13Burak;

import java.util.Scanner;

public class Split8 {
    public static void main(String[] args) {
        //todo bir scannaer oluşturup bir atasözü giriniz
        // girdiğiniz atasözünde her " " da splint metodunu uygulayınız

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir ata sözü yazınız: ");
        String atasozu=sc.nextLine();

        String[] kelime= atasozu.split(" ");

        for(String eleman:kelime){
            System.out.println(eleman);
        }


    }
}
