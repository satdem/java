package Gun21;

import java.util.function.DoubleToIntFunction;

public class GununSorusu {
    public static void main(String[] args) {
        //todo   Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
        //çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız

        int[][] a=new int[3][3];
        int[][] b=new int[3][3];

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=(int)(Math.random()*9);
                b[i][j]=(int)(Math.random()*9);

            }
        }

        int toplam=0;
        int[][] c=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k <3 ; k++) {
                for (int j = 0; j <3 ; j++) {
                    c[i][k]+=a[i][j]*b[j][k];

                }

            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {

                System.out.print(a[i][j]+" ");
            }
            System.out.println();


        }System.out.println("XXXXXXXXXxXXx");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(b[i][j]+" ");

            }
            System.out.println();
        }System.out.println("===========");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            } if(i==1) System.out.print("X");
            if(i!=1) System.out.print(" ");

            for (int j = 0; j < 3; j++) {
                System.out.print(" "+b[i][j]+" ");

            }if(i==1) System.out.print("= ");
             if(i!=1) System.out.print("  ");

            for (int j = 0; j <3 ; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

            }





        }
}
