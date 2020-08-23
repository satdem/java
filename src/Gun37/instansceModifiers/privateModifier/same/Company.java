package Gun37.instansceModifiers.privateModifier.same;

public class Company {
    public static void main(String[] args) {
        Person personel=new Person();
        personel.id=1;
        personel.name="Ahmet";
        personel.username="ahmet";
       // personel.password="1234";
        //burası privat olduğundan direk erişilemez

        personel.SifreBelirle("1234");
        personel.SifreBelirle("12345abcd");
        personel.SifreGoster();


    }
}
