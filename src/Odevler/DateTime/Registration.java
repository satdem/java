package Odevler.DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Registration {
    public ArrayList<User> register(){
        ArrayList<User> kullanicilar=new ArrayList<>();
        User kullanici=new User();
        String isim=kullanici.Name;
        LocalDateTime zaman=kullanici.registerDate;
        kullanicilar.add(kullanici);
        return kullanicilar;
    }

    public void printHappyUsers(ArrayList<User> register) {
        ArrayList<User> HappyUsers=new ArrayList<>();
        User kullanici=new User();
        LocalDateTime kulGiris=kullanici.registerDate;
        for (User dk:register) {
            if(dk.registerDate.getSecond()<=10 && dk.registerDate.getSecond()>=0){
                HappyUsers.add(dk);
            }

        }
        //System.out.println("HappyUsers = " + HappyUsers);
        HappyUsers.toString();
    }
}
