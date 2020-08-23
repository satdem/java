package Mentoring.Burak30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.adım :kod başlıyor");
        int[] arr=new int[3];
        try {
            arr[4] = 10;
            sc.nextInt();
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
            System.out.println(ex.toString());
            ex.printStackTrace();
        }catch (InputMismatchException ex){
            System.out.println(ex.toString());
        }
        System.out.println("kod bitiyor");
    }
}
