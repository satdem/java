package Gun59.Ornek1;

public class ChaseBank extends Bank{
    public ChaseBank(String name, String phoneNummer, String addres, int numEmployee) {
        super(name, phoneNummer, addres, numEmployee);
    }

    @Override
    void oppenAccount() {
        System.out.println("Hesap açmak için Kimlik numaranız ve telefon numaranız gereklidir");
    }

    @Override
    void closeAccount() {
        System.out.println(this.getClass().getSimpleName()+"Hesap kapama işlemi başarı ile gerçekleştirilmiştir");
    }
}
