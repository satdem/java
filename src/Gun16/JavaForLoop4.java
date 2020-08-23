package Gun16;

import java.util.Scanner;

public class JavaForLoop4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //girilen bir sayının faktöriyelini hesaplayın.
        System.out.print("Bir sayı giriniz : ");
        int a=oku.nextInt();
        int carpım=1;

        for(int i=1;i<=a;i++){
            carpım=carpım *i;
        }
        System.out.println("carpım = " + carpım);
    }
}
