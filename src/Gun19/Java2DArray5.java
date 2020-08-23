package Gun19;

public class Java2DArray5 {
    public static void main(String[] args) {
        //2 ders ve üç öğrencinin notlarını kendimiz tanımlarken 2 boyutlu dizide verin.
        //daha sonra ayrı bir döngü ile her bir dersin not ortalamasını bulunuz.
        int[] dizi1=new int[5];//1 boyutlu dizi tanımlama
        int[] dizi2={7,4,15,7,5};//1 boyutlu hem tanımlama hem değer verme

        int[][] mat1=new int[2][3];//2 boyutlu dizi tanımlama
        int[][] mat2={{65,76,90},{80,66,95}};//2 boyutlu hem tanımlama hem değer verme


        //dersler ve notların matris şeklinde yazılışı
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }

        //tum dersllerin toplmı
        int tumDersToplami=0;
        for(int satir=0;satir<2;satir++){
            for(int sutun=0;sutun<3;sutun++){
                tumDersToplami+=mat2[satir][sutun];

            }
            System.out.println();
        }

        //ilk dersin not ortalamsı yani 0. indexli ders
        int ilkDersToplami=0;

            for(int sutun=0;sutun<3;sutun++){
                ilkDersToplami+=mat2[0][sutun];

            }


        //ikinci dersin not ortalamsı yani 1. indexli ders
        int ikinciDersToplami=0;

            for(int sutun=0;sutun<3;sutun++) {
                ikinciDersToplami += mat2[1][sutun];
            }
        System.out.println("tumDersToplami = " + tumDersToplami);
        System.out.println("ilkDersOrtalaması = " + (ilkDersToplami/3));
        System.out.println("ikinciDersOrtalaması = " + (ikinciDersToplami/3));
    }
}
