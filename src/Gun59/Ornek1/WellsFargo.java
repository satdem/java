package Gun59.Ornek1;

public class WellsFargo extends Bank{
    public WellsFargo(String name, String phoneNummer, String addres, int numEmployee) {
        super(name, phoneNummer, addres, numEmployee);
    }

    @Override
    void oppenAccount() {
        System.out.println("Hesap açmak için kimlik bilgileriniz ve belli bir miktar para yatırmanız gerekiyor");

    }

    @Override
    void closeAccount() {
        System.out.println(this.getClass().getSimpleName()+"Hesap kapama işlemi gerçekleştirildi");
    }
}
