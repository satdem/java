package Gun47.Task2;

public class Banka {
    //1- bir Account(Hesap) sinıfı oluşturun. fieldları number,balance(bakiye)
    //2-bir constructor ekleyin
    //3-Account sınıfına deposit(paraekle) metodu ekleyinzi
    //4-Account sınıfına withdraw(paraÇıkar)metodu ekleyiniz
    //5-withdraw de 5000 nin üzerine çıkınca limit dışına çıktınız uyarısı versin
    //6-main metodunda 1 Account oluşturarak ihtimalleri deneyiniz
    public static void main(String[] args) {
        try {
            Account account1 = new Account(1);

            account1.deposit(1000);
            System.out.println("account1.balance = " + account1.getBalance());

            account1.withdraw(500);
            System.out.println("account1.balance = " + account1.getBalance());

            account1.withdraw(6000);
        }catch (Exception ex){
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }

}
