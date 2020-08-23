package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız meyve ismini bir diziye atadıktan sonra
        // elma ismi geçen meyve leri akrana yazdırın
        Scanner oku=new Scanner(System.in);
        String[] dizi=new String[5];
        for(int i=0;i<dizi.length;i++) {
            System.out.print(+i + ". meyveyi giriniz: ");
            dizi[i] = oku.nextLine();

        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        for(int i=0;i<dizi.length;i++){
            if(dizi[i].equalsIgnoreCase("elma")){
                System.out.println(dizi[i]);


                if (dizi[i].toLowerCase().contains("elma")) {
                    System.out.println(dizi[i]);
                }
            }
        }

        }
}
