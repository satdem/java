package Gun61;

public class soru3 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7};//0. satır
        arr[1] = new int[]{1,3};//1. satır
        for (int [] a: arr ) {
            for (int i: a ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//1 3 5 7
//1 3
