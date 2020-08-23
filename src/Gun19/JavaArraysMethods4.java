package Gun19;

import java.util.Scanner;

public class JavaArraysMethods4 {
    public static void main(String[] args) {
        //Kullanıcıdan alcağınız bir cümleyi kelimelerine ayırarak alt alta yazdırın
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle yazınız:");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" ");//boşluk karakterine göre böler

        for(int i=0;i<kelimeler.length;i++){
            System.out.println(kelimeler[i]);
        }
        //2. yöntem foreach (sıra önemli değilse kullanılabilir)
        for(String elemanDegeri:kelimeler){
            System.out.println(elemanDegeri);
        }
    }
}
