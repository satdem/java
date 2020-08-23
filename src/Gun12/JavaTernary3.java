package Gun12;

import java.util.Scanner;

public class JavaTernary3 {
    //önce iki soru çözdü onlar bende ödev bölümünde

    public static void main(String[] args) {
        //kullanıcının gireceği sayı çift ise bir stringe ".ift" atayın
        //tek ise "tek" atayın ve ekrana yazdırın
        Scanner oku=new Scanner(System.in);
        int sayi=oku.nextInt();
         String text="";
         /* if(sayi%2==0)
              text="çift";
          else
              text="tek";*/

        text=(sayi%2==0) ? "çift" : "tek";// bu yukarıdaki ifl ifade ile aynı anlamı taşıyor
        //kısa yolu ?if  :else demek ( üçlü operatör  =?: )

        System.out.println(text);

    }
}
