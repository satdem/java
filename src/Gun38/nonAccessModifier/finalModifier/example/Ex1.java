package Gun38.nonAccessModifier.finalModifier.example;

public class Ex1 {
    public static void main(String[] args) {
        //bir dairenin alanı pi*r*r idi
        int yaricap=4;

        double alan=4*4*Costants.pi;

        //kullanıcıdan alacağınız saat ,dakika ve gün bilgisini
        // saniyeye ceviriniz
        int gun=23;
        int saat=7;
        int dakika=25;

        int saniyeCinsinden=((gun*Costants.haaurInDay+saat)*Costants.minuteInHaur+dakika)*Costants.secondInMinute;

        System.out.println(saniyeCinsinden);
    }
}
