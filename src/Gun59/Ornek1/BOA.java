package Gun59.Ornek1;

public class BOA  extends Bank{
    public BOA(String name, String phoneNummer, String addres, int numEmployee) {
        super(name, phoneNummer, addres, numEmployee);
    }

    @Override
    void oppenAccount() {
        System.out.println("Adınız ve adress bilgileriniz gerekli" );
        System.out.println("hesap açılmıstır");
    }

    @Override
    void closeAccount() {
        System.out.println(this.getClass().getSimpleName()+"Hesabınız kapatılmıştır");
    }
}
