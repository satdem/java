package Gun44.JavaTryCatch;

public class _3_JavaTryCatchFinaly {
    public static void main(String[] args) {

        try {
            String str = "";
            System.out.println("hatadan önceki bölüm çalıştı");
            char ilkHarf = str.charAt(0);
            System.out.println("hatadan sonraki bölüm çalıştı");
        }
        catch (Exception ex){
            System.out.println("ex = " + ex);
            System.out.println("Catch bölümü çalıştı");

        }
        finally {//burası hata olsun olmasın çalışır
            //kullanım sebebi try catch içnde yapılmış işlemlerde arda kalan kapama gibi bu bölüme ait işlemler
            //yapılarak kod düzeni sağlanmış olur
            System.out.println("finally bölümü çalıştı");

        }
        System.out.println("tüm hata kodlarından sonraki normal kodların olduğu bölüm çalıştı");
    }

}
