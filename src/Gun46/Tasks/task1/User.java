package Gun46.Tasks.task1;

import java.util.ArrayList;

public class User {
    //1-fieldları id,username,password,active(boolean),signedIn(boolean)
    //olan bir User class tanımlayın
    //2-bütün field ları parametre alan bir constructer tanımlayın
    //3-bütün fieldler için getter ve setter metodlarını oluştur
    //4-UserName isminde main için bir class oluşturunuz
    //5-Kullanıcıdan 2 adet user bilgisi isteyerek bir arrayliste doldurunuz
    //active true signedIn false default değeri ataayınız
    //6-eğer password 6 dan küçük ise yeniden userı girsin
    // buu class da kontrol ediniz
    //Sadece Password istese ne yapardınız

    private String userName;
    private int id;
    private String password;
    private boolean active;
    private boolean signedIn;
   private static int count=1;


    public User(String userName,  String password) {
        setUserName(userName);
        this.id = count++;
        setPassword(password);
        setActive(true);
        setSignedIn(false);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = count++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)  {
    if(password.length()<6)
    throw new RuntimeException("Password 6 karakterden uzun olmalı");
        this.password = password;
    }

    public boolean isActive() {//boolean larda is olarak atıyor
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    public ArrayList<User> kullanici(User a){
        ArrayList<User> users=new ArrayList<>();
        users.add(a);
        return users;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
