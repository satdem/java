package Mentoring.Burak33.Ornek3;

public class insanMain {
    public static void main(String[] args) {
        insan arif=new insan();

        cocuk Can=new cocuk();

        arif.boy=175;
        arif.kilo=60;
        arif.buyume();
        arif.spor();
        arif.yemek();
        System.out.println("arif boy = " + arif.boy);
        System.out.println("arif kilo = " + arif.kilo);

        Can.boy=55;
        Can.kilo=10;
        Can.buyume();
        Can.spor();
        Can.yemek();
        System.out.println("Canın boyu = " + Can.boy);
        System.out.println("Canın kilosu = " + Can.kilo);


    }
}
