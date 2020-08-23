package Repl_it.oopllnJava.Encapsulation;

import java.util.Scanner;

public class Encapsulation3 {
    /*Burada iki class vardır. Biri Main diğeri ise Subscribe.
Subscribe class'ının içinde;
Bu variables'ları private oluşturunuz.
String name
boolean doYouWanaSubscribe
String whichMember
3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)
Main class'ın içinde;
Örnek;
Name is Victoria, doYouWanaSubscribe true, whichMember Gold
Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon. yazdırınız.
Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.
Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.
Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
See you when you want to be a member. Thanks yazdırınız.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String whichMember = scan.nextLine();
        boolean doYouWanaSubscribe = scan.nextBoolean();
        Subscribe s = new Subscribe();
        s.setName(name);


        if (doYouWanaSubscribe == true) {


            if (whichMember.equalsIgnoreCase("Gold")) {
                System.out.println("Welcome to membership " + s.getName() + ". Your membership is 40 dollar for month you can enjoy the videos " +
                        ", all homework and see you soon.");
            } else if (whichMember.equalsIgnoreCase("Silver")) {
                System.out.println("Welcome to membership " + s.getName() + ". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
            } else if (whichMember.equalsIgnoreCase("Bronze")) {
                System.out.println("Welcome to membership " + s.getName() + ". Your membership is 10 dollar for month you can enjoy the videos.");
            }
        }
        else if (doYouWanaSubscribe == false)
                System.out.println("See you "+s.getName()+" when you want to be a member. Thanks.");
        }

}
class Subscribe{
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {

        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }
}
