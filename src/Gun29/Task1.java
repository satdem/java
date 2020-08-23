package Gun29;
//kullanıcıya
//1-Ekleme
//2-Listeleme
//3-Arama
//4-Düzeltme
//5-Çıkış
//Seçeneklerini vererek usename, password ve userTip(meslek) dan oluşan bir map tanımlayınız
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.

// Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void Ekleme(Map<String,Map<String,String>> users){
        Scanner oku=new Scanner(System.in);
        System.out.print("Username= ");
        String username=oku.nextLine();

        System.out.print("Password= ");
        String password=oku.nextLine();
        System.out.print("UserType= ");
        String userType=oku.nextLine();

        Map<String,String>  bilgilerMap=new HashMap<>();
        bilgilerMap.put("password",password);
        bilgilerMap.put("usertype",userType);

        users.put(username,bilgilerMap);

    }
    public static void Listeleme(Map<String,Map<String,String>> users){
        System.out.println("users = " + users);
    }
    public static void Arama(Map<String,Map<String,String>> users){
        Scanner oku=new Scanner(System.in);
        System.out.print("Username yazınız=");
        String username=oku.nextLine();
        System.out.println(users.get(username));

    }
    public static void Duzeltme(Map<String,Map<String,String>> users){
        Scanner oku=new Scanner(System.in);
        System.out.print("username yazınız: ");
        String username=oku.nextLine();

        System.out.print("yeni password= ");
        String newpassword=oku.nextLine();

        System.out.print("Yeni usertype= ");
        String newUsertype=oku.nextLine();

        Map<String,String> yenibilgiler=new HashMap<>();
        yenibilgiler.put("password",newpassword);
        yenibilgiler.put("usertype",newUsertype);

        users.put(username,yenibilgiler);
        System.out.println("users = " + users.get(username));
    }


    public static void main(String[] args) {
        Map<String,Map<String,String>> users=new HashMap<>();//1 tane login bilgisi için
        // username,passwordVeUsertip


        Scanner oku=new Scanner(System.in);
        int a;
        do{
            System.out.println("*********MENÜ*********");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");
            System.out.println("4-Düzeltme");
            System.out.println("5-Çıkış");
            System.out.println("Bir seçenek seçiniz");
            a=oku.nextInt();
            switch (a){
                case 1: Ekleme(users);
                    break;
                case 2: Listeleme(users);
                    break;
                case 3: Arama(users);//kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
                    break;
                case 4: Duzeltme(users);//kullanıcidan bir username alınıp bilgilerinin değiştirilmesi sağlanacak
                    break;

            }


        }while (a!=5);
    }
}
