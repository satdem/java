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

        String name = scan.nextLine();
        int roomCount  = scan.nextInt();
        boolean  balconyOrNo  = scan.nextBoolean();


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
    int Kira(){
        int kira=0;
        if(roomCount==0){
            kira=1400;
        }
        else if (roomCount==1){
            kira=1700;
        }else if (roomCount==2){
            kira=2200;
        }else if (roomCount==3){
            kira=2700;
        }
        return kira;
    }
    int amountOfRent(){
        int kira=Kira();
        if(balconyOrNo){
            kira+=200;
        }
        return kira;
    }
}
