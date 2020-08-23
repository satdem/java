package Mentoring.Omer31;

public class islem {
    /*
        randomSayi isminde static void bir method oluşturun.

        Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

        Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)
         */
    static void randomSayi() throws Exception {
        int random1=(int)(Math.random()*10+1);
        int random2=(int)(Math.random()*10+1);
        System.out.println("(random2+random1) = " + (random2+random1));
        if(random1+random2<12){
            throw new Exception("toplam 12 veya 12 den büyük olmalı");
        }
        System.out.println(random1+random2);
    }

    public static void main(String[] args) {
        try {
            randomSayi();
        }catch (Exception ex){
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
    }
}
