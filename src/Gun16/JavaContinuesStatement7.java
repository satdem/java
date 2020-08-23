package Gun16;

import java.util.Scanner;

public class JavaContinuesStatement7 {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker alltalta olacak şekilde yazdırın.
        //boşluk ve a harfi geldiğinde yazmasın
        //continue çalıştığında bu adımı es geçer ve devam eder.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz:");
        String str=oku.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)==' ')
                continue;//bu adımı atlar devam eder.
            System.out.println(str.charAt(i));
        }

    }
}
