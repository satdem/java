package Gun21;

public class JavaMatris1 {
    public static void main(String[] args) {
        int sayi=0; //hafızada bir sayı yeri ayırır
        int[] dizi=new int[5]; //hafızada 5 tane yer(0,1,2,3,4 indisli) int yeri ayırır
        int[][] mat=new int[4][5];//hafızada 20 yer ayırır. 4 satır, 5sütun

        //1. satır için
        mat[0][0]=(int)(Math.random()*100)+1;
        mat[0][1]=(int)(Math.random()*100)+1;
        mat[0][2]=(int)(Math.random()*100)+1;
        mat[0][3]=(int)(Math.random()*100)+1;
        mat[0][4]=(int)(Math.random()*100)+1;

        //2. satır için
        mat[1][0]=(int)(Math.random()*100)+1;
        mat[1][1]=(int)(Math.random()*100)+1;
        mat[1][2]=(int)(Math.random()*100)+1;
        mat[1][3]=(int)(Math.random()*100)+1;
        mat[1][4]=(int)(Math.random()*100)+1;

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                mat[i][j]=(int)(Math.random()*100)+1;

            }
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();
        }
    }
}
