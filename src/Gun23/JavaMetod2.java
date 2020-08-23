package Gun23;

public class JavaMetod2 {
    public static int toplambul(int a,int b){
        int toplam=a+b;
        return toplam;
    }
    public static void main(String[] args) {
        int sayi1=14;
        int sayi2=32;
        int sonuc=toplambul(sayi1,sayi2);
        int sayi3=4;
        int sonuc2=toplambul(sonuc,sayi3);//burada return yaptığım için toplamı kullanabiliyorum
        System.out.println("sonuc2 = " + sonuc2);

    }
}
