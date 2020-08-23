package Gun14;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //girilen bir sayıya kadar olan sayılardan sadece tek olanları yazdırınız
        System.out.println("Bir sayı giriniz: ");
        int a=oku.nextInt();

        while(a>0){
            if(a%2==1){
                System.out.println(a);
            }
            a--;
        }
    }
}
