package Gun43.JavaException;

import java.util.Scanner;

public class _5_JavaTryCatch {
    public static void main(String[] args) {
        String str="bugun";//"bugün" ile dene. boş dene"".
        int a=5;
        int b=0;
        int c=0;

        try {
            System.out.println("1. Adım");
            char ilkHarf = str.charAt(0);//burada hata oluşunca diğerlerine bakmıyor
            System.out.println("2.Adım");
            c=a/b;
            System.out.println("3. Adım");

        }
        /*catch (Exception ex){//Exception bütün hatalar için kullanılıyor

            System.out.println("4. adım");
            System.out.println("hata: String dizisinin sınırı aşıldı");
        }*/

        catch (ArithmeticException ex){
            System.out.println("aritmetik hata oluştu");
        }

        catch (StringIndexOutOfBoundsException ex){//bu hata olursa burası çalışır
            // bu hata olmazsa diğer hatadan burası çalışmaz program kırılır
            System.out.println("hata: String dizisinin sınırı aşıldı");

        }

        catch (Exception ex){
            System.out.println("Genel hata oluştu");
        }

        System.out.println("5.Adım");
    }
}
