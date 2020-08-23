package Gun61;

public class soru7 {
    public static void main(String[] args) {
        String [][] chs = new  String [2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i =97;
        for (int a = 0; a < chs.length; a++) {//2 tane yazdırıyor
            for (int b = 0; b < chs.length; b++) {//2 tane de buradan
                chs[a][b]= ""+i;//97 98 99 100 null null null oluyor
                i++;
            }
        }
        for (String [] ca: chs ) {
            for (String c: ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}/*int [][]a=new int [2][];
            int [][]b=new int [][2]; // hata veriyor*/
