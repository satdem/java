package Gun58.Ornek1;

import Odevler.InterFace.Odev1.Shark;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    static void menu(){
        System.out.println("Menü:"+
                "\n1.Adana Kebap : 5€ " +
                "\n2.Lahmacun : 2€"+
                "\n3.Borsh :3€"+
                "\n4.Palov :4€"+
                "\n5.Tamam");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int siparis=0;
        ArrayList<IFood> yemekListesi=new ArrayList();
        do{
            menu();
            System.out.println("hangi yemekleri seçiyorsunuz");
             siparis=sc.nextInt();
             switch (siparis){
                 case 1:{
                     AdanaKebap ak=new AdanaKebap();
                     yemekListesi.add(ak);break;
                 }
                 case 2:{
                     Lahmacun lahmacun=new Lahmacun();
                     yemekListesi.add(lahmacun);break;
                 }
                 case 3:{
                     Borsh borsh=new Borsh();
                     yemekListesi.add(borsh);break;
                 }
                 case 4:{
                     Palov palov=new Palov();
                     yemekListesi.add(palov);break;
                 }

             }

        }while (siparis!=5);

        double ucret=0;

        for (IFood yemek:yemekListesi) {
           if (yemek instanceof AdanaKebap){
               TechnoKitchen.Pisir((AdanaKebap) yemek);
               System.out.println(yemek.getClass().getSimpleName()+"yemeğin tadını nasıl buldunuz");
               yemek.taste();
               ucret+=yemek.ucret();
           }
           else if (yemek instanceof Lahmacun){
               TechnoKitchen.Pisir((Lahmacun) yemek);
               System.out.println("yemeğin tadını nasıl buldunuz");
               yemek.taste();
               ucret+=yemek.ucret();
           }
           else if(yemek instanceof Borsh){
               TechnoKitchen.Pisir((Borsh) yemek);
               System.out.println(yemek.getClass().getSimpleName()+"yemeğin tadını nasıl buldunuz");
               yemek.taste();
               ucret+=yemek.ucret();
           }
           else if(yemek instanceof Palov){
               TechnoKitchen.Pisir((Palov) yemek);
               System.out.println(yemek.getClass().getSimpleName()+"yemeğin tadını nasıl buldunuz");
               yemek.taste();
               ucret+=yemek.ucret();
           }
        }
        System.out.println("ücret= "+ucret);

        /* //hocanın yöntemi

         System.out.println("Alınan Siparişler\n");
        for (IFood yemek: siparis)
        {
            System.out.println(yemek.getClass().getSimpleName()+"\n");//burada yemek listesi yazdırılıyor
        }
        System.out.println();


        double toplamUcret=0;
        for (IFood yemek: siparis)
        {
            TechnoKitchen.Pisir(yemek);
            toplamUcret += yemek.ucret();
        }

        System.out.println("Toplam ücret="+toplamUcret);

    */

    }
}
