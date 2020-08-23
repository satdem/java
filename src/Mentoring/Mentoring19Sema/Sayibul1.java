package Mentoring.Mentoring19Sema;

public class Sayibul1 {
    /*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane sayı oldugunu return eden  methodu yazdiriniz
     */
    public static void main(String[] args) {

        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        System.out.println(SayiSayisi(array));

    }
    public static int SayiSayisi(int[][] a){
        int ss=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {

                ss++;
            }

        }

        return ss;
    }
}
