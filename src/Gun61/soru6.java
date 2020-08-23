package Gun61;

public class soru6 {
    public static void main(String[] args) {
        String [][] chs = new  String [5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i =97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {//chs.length=5 ama chs[0] 2 boyutlu olduğu için hata verecek
                chs[a][b]= ""+i;
                i++;
            }
        }
        for (String [] ca: chs ) {
            for (String c: ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
// ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException hatası veriyor
