package Mentoring.mentoring24Omer.Mentoring14omer;

public class Arrays2D {
    public static void main(String[] args) {
        // tek boyutlu Array
        int[] array={1,2,3,4,5};

        // çift boyutlu Array

        //               0. satır  1.satır
        int[][] d2Array={{30,50},{25,10}};
        //           1.stn,2.stn 1.stn,2.stn

        //soesefik eleman seçme
        System.out.println(d2Array[1][1]);

        //yazdırma şekli
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(d2Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
