package Mentoring.Mentoring19Sema;

import java.util.Scanner;

public class Input2DArray3 {
    /*
    int[][] m = new int[2][4];
    Ekrandan 2D Array in elementlerini alan ve bunlarin toplamini yazdiran Java programini yaziniz
    task1-->Scanner class  ile ekrandan 2D Array in degerlerini alabilen kod parcasini yaziniz.
    */
    public static void main(String[] args) {
        int[][] m=new int[2][4];
        Scanner input=new Scanner(System.in);
        System.out.println("");

        System.out.println(" elemanları toplamı= " +toplamBulma(m));
    }
    public static int toplamBulma(int[][] a){
        Scanner input=new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length; j++) {
                System.out.print("Bir sayı giriniz");
                a[i][j]=input.nextInt();
                toplam+=a[i][j];

            }

        }
return toplam;
    }
}
