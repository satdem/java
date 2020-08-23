package Gun32.Tasks.Task2;

public class task2 {
    //1.ADIM :ayrı dosyada olmak üzere Customer(müşteri) isimli(fields:name) isimli bir class tanımla
    //2.ADIM: ayrı bir dosyada ElectricityAccount isimli (fields:totalKw,rate,bill)
    //3.ADIM: Customer a bir ElectricityAccount ekleyiniz.
    //4.ADIM: Bir tane müşteri oluşturunuz Accountu dahil
    //5.ADIM: Müşteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //metodun adı tıketimEkle olsun ve her ayki kullanımı sırayla eklesin
    //6.ADIM: ödenecek rakamı toplam tüketimi rate ile çarparak hesaplayınız
    public static void main(String[] args) {
        //4.adımda hem müşteriyi hem de elektrik aboneliğini oluşturduk
        Customer musteri1=new Customer();
        musteri1.name="Kaya";
        musteri1.electricityAbonesi=new ElectricityAccount();

        musteri1.electricityAbonesi.tuketimEkle(100);//ocak ayı
        musteri1.electricityAbonesi.tuketimEkle(150);//şubat ayı
        System.out.println("musteri1.electricityAbonesi.totalKw = " + musteri1.electricityAbonesi.totalKw);

        System.out.println("musteri1.electricityAbonesi.totalBill() = " + musteri1.electricityAbonesi.totalBill());

        System.out.println("musteri1.electricityAbonesi.bill = " + musteri1.electricityAbonesi.bill);
        //yukarısı ile aynı anlama geliyor.Ama önce totalBill çalışınca buna bakabilirim
        // çünkü totalBill bill i hesaoplıyor
    }
}
