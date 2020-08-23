package Gun5;

public class Ornek7 {
    public static void main(String[] args) {
        //Soru: short olarak atadığınız değeri stringe çevirerek yazdırınız.
        short s= 23;
        String yaziHali=Short.toString(s);
        System.out.println("yaziHali= " + yaziHali);

        int sayi=245;  //sayı değeri taşır matematiksel işlemlerde kullanılabilir.
        String KelimeHali="245";  //sayı değeri taşımaz. mat. işlemi yapamazsın.
        int top=34+sayi;
        // int top2= 34+kelimeHali yazamazsın.



    }
}
