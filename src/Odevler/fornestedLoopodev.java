package Odevler;

public class fornestedLoopodev {
    public static void main(String[] args) {
        //TODO Write program that prints this using loops
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *

       /* for (int satir = 0; satir <= 5; satir++) {
            for (int bosluk = 0; bosluk < satir; bosluk++) {
                System.out.print(" ");
            }
            for (int sutun = 1; sutun < 12 - satir * 2; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int sat=0;sat<6;sat++){
            for(int bos=0;bos<sat;bos++){
                System.out.print(" ");
            }
            for(int sut=1;sut<=11-2*sat;sut++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}