package Repl_it.oopllnJava.Encapsulation;

import java.util.Scanner;

public class Encapsulation4 {
    /*Burada iki adet class vardır. Biri Main diğeri ise rentApartments
rentApartments'ın içinde;
Bu variable'ları private olarak oluşturun;
String name
int roomCount
boolean balconyOrNo
Bütün variable'lar için getter ve setter oluşturunuz.
4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
-----------------------------------------------------------------
Bir method oluşturun;
Eğer room sayısı 0 ise,
rent(kira) 1400
Eğer oda sayısı 1 ise,
rent  1700
Eğer oda sayısı 2 ise,
rent 2200
Eğer oda sayısı 3 ise,
rent 2700
rent'i return'leyin.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isim:");
        String name = scan.nextLine();
        System.out.println("oda sayısı");
        int roomCount  = scan.nextInt();
        System.out.println("balkon varmı");
        boolean  balconyOrNo  = scan.nextBoolean();

        rentApartments ra=new rentApartments();
        int kira=ra.Kira(roomCount);
        kira=ra.amountOfRent(balconyOrNo);
        System.out.println("kira = " + kira);

    }
}
class rentApartments{
    private String name;
    private  int roomCount;
    private boolean balconyOrNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    int kira=0;
    int Kira(int setroomCount){
        if(setroomCount==0){
            kira=1400;
        }
        else if (setroomCount==1){
            kira=1700;
        }else if (setroomCount==2){
            kira=2200;
        }else if (setroomCount==3){
            kira=2700;
        }
        return kira;
    }
    int amountOfRent(boolean balconyOrNo){

        if(balconyOrNo){
           kira+=200;
        }

        return kira;
    }


}
