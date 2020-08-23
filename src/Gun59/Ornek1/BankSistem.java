package Gun59.Ornek1;

import java.util.Scanner;

public class BankSistem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Adınızı yazınız.");
        String name=sc.nextLine();
        System.out.print("Telefon numaranızı yazınız.");
        String phoneNummer=sc.nextLine();
        System.out.print("Adres bilgilerinizi yazınız.");
        String adress=sc.nextLine();
        int numEmployee=1;//sicil nosu

        int istek=0;

        BankaIstek();
        Bank bank=null;

        System.out.println("Hangi bankayı seçiyorsanız numarasını giriniz");
        istek=sc.nextInt();
        switch (istek){
            case 1: WellsFargo wf=new WellsFargo(name,phoneNummer,adress,numEmployee);
                wf.oppenAccount();
                bank=wf;
                break;
            case 2:ChaseBank cb=new ChaseBank(name,phoneNummer,adress,numEmployee);
            bank=cb;
                cb.oppenAccount();break;
            case 3:BOA boa=new BOA(name,phoneNummer,adress,numEmployee);
            bank=boa;
                boa.oppenAccount();break;

        }
        System.out.println("--------------------");
        int istek2=0;
        double miktar=0;

        do{
            paraCekmeYatirma();
            istek2=sc.nextInt();

            switch (istek2){

                case 1:
                    System.out.println("Yatırmak istediğiniz miktarı giriniz:");
                    miktar=sc.nextInt();
                    System.out.println(bank.deposit(miktar));
                    break;
                case 2:
                    System.out.println("Çekmek  istediğiniz miktarı giriniz:");
                    miktar=sc.nextInt();
                    System.out.println(bank.withdraw(miktar));
                    break;
                case 3:
                    System.out.println("bakiyeniz: "+bank.getBalance());
                    break;
                case 4:
                    bank.closeAccount();

            }
            System.out.println("-----------------------------");

        }while (istek2!=5);

    }
    static void BankaIstek(){

        System.out.println("Hangi bankada hesap açmak istiyorsunuz?\n"+
                "1.WellsFargo\n"+
                "2.ChaseBank\n"+
                "3.BOA\n"+
                "4.Çıkış");

    }
    static void paraCekmeYatirma(){
        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz.\n"+
                "1.Para Yatırma\n"+
                "2.Para çekme\n"+
                "3.Bakiye sorma\n"+
                "4.Hesap kapatma\n"+
                "5.Çıkış.");
    }
}
